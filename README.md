# parameterized_classes

About
This is the execution of second sprint of the KitchIntel project. 
This deals with rectifying the design defects. For instance, The AbstractAmount class contains a compareTo() method, but does not implement the Comparable interface.
The changeBy() and compareTo() methods both take Amount objects as parameters. This means that, for example, a Weight object can be compared to and/or changed by
a Piece object.
The Amount interface must now extend the Comparable interface.
