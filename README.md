# pojo-test-sample

MyPojo is a simple Java class, with the utility methods (toString, hashCode and equals) auto-generated by IntelliJ. 

The test class shows how all the components of the Pojo can be tested in a single call.

The only issue with this is that it does not work with lombok. I believe this is because lombok generated the getters and setters on the fly, and Pojo-Tester can't access them.