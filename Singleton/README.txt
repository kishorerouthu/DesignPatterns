 Singleton Pattern
    Singleton Pattern restricts the instantiation of a class and esures that only one instance of the class exists in the
    Java Virtual Machine.

    To implement singleton pattern, we have different approaches but all of them have the following common concepts.
        - Private constructor to restrict instantiation of the class from other classes.
        - Private static variable of the same class type that is only instance of the class.
        - Public static method that returns the instance of the class, this is the global access point for outer
          world to get the instance of singleton class.

    Following are the different approaches to create singleton object of the class.
        1. Eager Initialization
        2. Static block Initialization
        3. Lazy Initialization
        4. Thread Safe Singleton
        5. Bill Pugh Singleton Implementation
        6. Using Reflection to destroy singleton.
        7. Enum singleton
        8. Serialization and Singleton

    There are 3 concepts which can break singleton property of a class.
        1. Reflection
        2. Clone
        3. Serialization
