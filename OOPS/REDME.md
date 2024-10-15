## lazy copy ..
``
Key Points of Lazy Copying:
Deferred Execution: The actual copying of data is postponed until it is required, often when a modification (like adding or changing an element) is requested.

Efficiency: By avoiding unnecessary copies, lazy copying can reduce memory usage and increase performance, particularly in scenarios where objects are frequently read but infrequently modified.

Copy-on-Write: This is a common implementation strategy. For instance, in collections, if a list is copied only when a modification is needed, it allows multiple references to share the same underlying data until one needs to change it.

Use Cases: Lazy copying is useful in situations where:

Objects are large or complex, making copying expensive.
Shared data integrity is important until a modification is made.
You want to implement efficient caching or memoization.
Overall, lazy copying helps optimize resource management in software applications, particularly when dealing with large data structures or objects.
``