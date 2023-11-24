# Design Patterns: Builder

### 1. Quick idea about this pattern/Problem which this pattern solve?
To create an object, you execute a series of these steps on a builder object. The important part is that you don’t need to call all the steps. You can call only those steps that are necessary for producing a particular configuration of an object.

This pattern solve problem such as: initialization code is usually buried inside a monstrous constructor with lots of parameters, or even worse: scattered all over the code.
### 2. Where should we use this pattern (examples)?
When we have object that have many fields, but usually we don't need to create object with all fields
### 3. Pros and Cons
Pros:
- You can construct objects step-by-step
- You can use same construction code to building various objects

Cons:
- Overall complexity of the code increases due creating new classes