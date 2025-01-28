# Unhandled Exception in Scala Auxiliary Constructor

This example demonstrates a subtle error that can occur when using auxiliary constructors in Scala.  The `IllegalArgumentException` is thrown because the default value of `x` (0) doesn't meet the condition in `myMethod`. The solution involves careful consideration of default values and exception handling in auxiliary constructors.