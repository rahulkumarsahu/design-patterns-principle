package com.design.patterns.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

    /**
     * Calling getInstance() method many times returns same hashcode that proves that Singleton class creates only one instance
     */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {

     //   SingletonEagerInitialization s1 = SingletonEagerInitialization.getInstance();
     //   SingletonEagerInitialization s2 = SingletonEagerInitialization.getInstance();

      //  System.out.println(s1.hashCode());
      //  System.out.println(s2.hashCode());

        //for thread safe
        /**
        ExecutorService executorService = null;
        MyThread myThread = new MyThread();
        try {
            executorService = Executors.newFixedThreadPool(5);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(executorService != null)
                executorService.shutdown();
        }
       **/
        // DestroySingletonReflection
        // Reflection -> even though my constructor is private I can change the behaviour of the class at runtime by setting some flags. I
       // this is how we can break all singleton ? how to prevent using Enum
        /**
        SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization singletonLazyInitialization1 = null;
        Constructor<?>[] constructors = SingletonLazyInitialization.class.getDeclaredConstructors();
        for(Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);

            Object object = constructor.newInstance();
            singletonLazyInitialization1 = (SingletonLazyInitialization) object;
            break;
        }

        System.out.println(singletonLazyInitialization.hashCode());
        System.out.println(singletonLazyInitialization1.hashCode());
        **/

        // using enum test case
        /**
        EnumSingleton singleton1 = EnumSingleton.GET_INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.GET_INSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        String welcome = singleton1.welcome();
        System.out.println(welcome);
         **/

        // Serialization break comment readResolveMethod
        // distributed system sometime we have to implement serializable interface in singleton class so we can store the
        // state of that class in file system and drive it later point of time
        // but problem here is when we deserialize it will create new instance of that class.

        /**
        ObjectOutput objectOutput = null;
        // serialize process
        SerializationSingleton singleton1 = SerializationSingleton.getInstance();
        SerializationSingleton singleton2 = null;
        try {
            // file name where we want to serialize
            objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            objectOutput.writeObject(singleton1);

            objectOutput.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(objectOutput != null)
                objectOutput.close();
        }

        ObjectInput objectInput = null;
       // deserialize process
        try {
            objectInput = new ObjectInputStream(new FileInputStream("singleton.ser"));

            Object readObject = objectInput.readObject();

            singleton2 = (SerializationSingleton) readObject;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(objectInput != null)
                objectInput.close();
        }

        /**
         * hascode of original singleton
         * object(singleton1) and serialized
         * object(singleton2) are same
         * so singleton has not broken.
         */
        /**
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        **/

        SingletonClone s1 = SingletonClone.getInstance();
        SingletonClone s2 = (SingletonClone) s1.clone();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
