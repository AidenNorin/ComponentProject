# Portfolio Part 1: Component Brainstorming

- **Name**: Aiden Norin
- **Dot Number**: norin.4
- **Due Date**: 2/6 @ 1:50 PM EST

## Assignment Overview

The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist

To be sure you have completed everything on this assignment, we have littered
this document with TODO comments. You can browse all of them in VSCode by
opening the TODOs window from the sidebar. The icon looks like a tree and will
likely have a large number next to it indicating the number of TODOS. You'll
chip away at that number over the course of the semester. However, if you'd
like to remove this number, you can disable it by removing the following
line from the `settings.json` file:

```json
"todo-tree.general.showActivityBarBadge": true,
```

Which is not to be confused with the following setting that adds the counts
to the tree diagram (you may remove this one as well):

```json
"todo-tree.tree.showCountsInTree": true,
```

## Assignment Learning Objectives

Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points

Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives *directly* in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

| Learning Objective                                                                                        | Subcategory                 | Weight | Missing                                                     | Beginning                                                                              | Developing                                                                                     | Meeting                                                                                 |
| --------------------------------------------------------------------------------------------------------- | --------------------------- | ------ | ----------------------------------------------------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| Students should be able to identify their values, interests, and/or goals as they relate to their designs | Metacognitive Memory        | 3      | (0) No attempt to summarize values, interests, and/or goals | (1) A brief description of values, interests, and/or goals is provided but lacks depth | (2) A description of values, interests, and/or goals is provided by are not related to designs | (3) A description of values, interests, and/or goals is provided and relates to designs |
| Students should be able to predict the feasibility of their designs                                       | Metacognitive Understanding | 3      | (0) No attempt to design components that are feasible       | (1) At least one component is feasible                                                 | (2) At least two components are feasible                                                       | (3) All three components are feasible                                                   |
| Students should be able to use the OSU discipline in all three designs                                    | Metacognitive Application   | 4      | (0) No attempt to follow the OSU discipline in designs      | (1) At least one design follows the OSU discipline                                     | (3) At least two designs follow the OSU discipline                                             | (4) All three designs follow the OSU discipline                                         |

Below is further rationale/explanation for the rubric items above:

1. Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

My current aspiration is to go into datascience. I find the field of datascience to be very interesting as data can be used in many different ways to gain information about thhe world around us, and how to best make decisions going forwards. As for my hobbies, I'm a huge fan of flying FPV drones, and playing fighing games like Street Fighter and Guilty Gear.

## Assignment

As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided [some example components][example-components]
that may help you in your brainstorming. All of these components were made at
some point by one of your peers, so you should feel confident that you can
accomplish any of them.

There is no requirement that you use any of the components listed above.
If you want to model something else, go for it! Very common early object
projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

**Note**: Sometimes students will already know what they want to design
and will feel forced to make one-off designs for components they'll never
build. If that's you, you may submit three different designs for the same
component (rather than three different components). This will strengthen your
final design because you'll have an opportunity to think about different ways of
organizing the API. As an example, later in the course, you will see a tree
component that doesn't work by accessing the children through aliases but rather
by assembling and disassembling the tree. You will also see a variety of
list-like components that have different ways of manipulating the data. Think
about different ways you might allow a client to manipulate your component.

### Example Component

To help you brainstorm a few components, we've provided an example below of a
component you already know well: NaturalNumber. We highly recommend that you
mirror the formatting as close as possible in your designs. By following this
format, we can be more confident that your designs will be possible.

- Example Component: `NaturalNumber`
  - **Description**:
    - The purpose of this component is to model a non-negative
      integer. Our intent with this design was to keep a simple kernel that
      provides the minimum functionality needed to represent a natural number.
      Then, we provide more complex mathematical operations in the secondary
      interface.
  - **Kernel Methods**:
    - `void multiplyBy10(int k)`: multiplies `this` by 10 and adds `k`
    - `int divideBy10()`: divides `this` by 10 and reports the remainder
    - `boolean isZero()`: reports whether `this` is zero
  - **Secondary Methods**:
    - `void add(NaturalNumber n)`: adds `n` to `this`
    - `void subtract(NaturalNumber n)`: subtracts `n` from `this`
    - `void multiply(NaturalNumber n)`: multiplies `this` by `n`
    - `NaturalNumber divide(NaturalNumber n)`: divides `this` by `n`, returning
      the remainder
    - ...
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, basically all OSU components have to be mutable as long as they
        inherit from Standard. `clear`, `newInstance`, and `transferFrom` all
        mutate `this`.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - No. All methods work with integers or other NaturalNumbers.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Yes. NaturalNumber is base 10, and we track that in a constant called
          `RADIX`.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes. The kernel methods `multiplyBy10` and `divideBy10` can be used to
        manipulate our natural number as needed. For example, to implement
        `increment`, we can trim the last digit off with `divideBy10`, add 1 to
        it, verify that the digit hasn't overflown, and multiply the digit back.
        If the digit overflows, we reset it to zero and recursively call
        `increment`.

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for manipulating a digit at a time in the number. The secondary
methods use these manipulations to perform more complex operations like
adding two numbers together.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `NaturalNumber1L` class which layers the
kernel on top of the existing `BigInteger` class in Java. It would also be
reasonable to implement `NaturalNumber2` on top of `String` as seen in
Project 2. Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.

- Component Design #1: `Triangle`
  - **Description**:
    - This component would attempt to model a created triangle by being given
      three vertices. This component would be able to give the area of the
      triangle, and weather or not it is an equilateral, acute, obtuse or right
      triangle. This component will store each vertex in a double[]. Hopefully
      allowing for the creation of both 2D or 3D triangles.
  - **Kernel Methods**:
    - `void addVertex(double[] coordinates)`: adds a new vertex to `this`.
    - `double[] removeVertex(double[] coordinates)`: removes the vertex found at `coordinates` from `this`.
    - `double[] removeAnyVertex()`: removes an arbitrary vertex from `this`.
    - `int numVertices()`: returns the number of vertices found in `this`.
    - `double angleDegrees(Triangle vertex)`: returns the angle between `this` and `vertex` in degrees.
    - `double angleRadians(Triangle vertex)`: returns the angle between `this` and `vertex` in radians.
    - `double getVertexCoordinates(int vertex)`: returns the coordinates of the vertex in `this` correlating with `vertex`.
  - **Secondary Methods**:
    - `String triangleType()`: returns whether `this` is acute, obtuse, right, or equilateral in the form of a string.
    - `boolean isAcute()`: returns true if `this` is acute, else false.
    - `boolean isObtuse()`: returns true if `this` is obtuse, else false.
    - `boolean isRight()`: returns true if `this` is right, else false.
    - `boolean isEquilateral()`: returns true if `this` is equilateral, else false.
    - `double area()`: returns the area of triangle `this`.
    - `double perimeter()`: returns the perimeter of triangle `this`.
    - `double edgeLength(int vertex1, int vertex2)`: returns the length of the edge formed between vertices `vertex1`, and `vertex2`, corresponding to vertices stored in `this`.
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, this component would need to be mutable for the design of the
        functions listed above to work. Many functions listed above will
        mutate `this`.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - I believe so, currently, I have the component defined to not require an
        internal class, but having an internal `Triangle.Vertex` class would
        make working with each vertex much easier.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Yes, the constant `PI` would be incredibly useful, though I could also
        just use `Math.PI` to be able to access the value of pi.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes, for example, I would be able to implement the `isAcute()` function
        by checking if all three angles in `this` are less than 90 degrees by
        using `angleDegrees()`.

- Component Design #2: `Data Table`
  - **Description**:
    - creates a table of statistics that will be able to be analyzed to gain
      information about the data collected. Information on a linear regression
      for the data points, the minimum values, maximum values, standard deviation,
      mean value, t-values or z-values, and the R-squared. I may be forgetting a
      few key components of what might be added, but this is still a good start.
  - **Kernel Methods**:
    - `void addPoint(double x, double y)`: adds a statistic to `this` with values `x` and `y`.
    - `void labelX(String label)`: labels the `x` axis of `this`.
    - `void labelY(String label)`: labels the `y` axis of `this`.
    - `String getLabelX()`: returns the label given to `x` in `this`.
    - `String getLabelY()`: returns the label given to `y` in `this`.
    - `double[] getXValues()`: returns an array containing the values of `x` in `this`.
    - `double[] getYValues()`: returns an array containing the values of `y` in `this`.
    - `double[] removePoint(double x, double y)`: removes the statistic in `this` with values `x` and `y`.
    - `void generatePoints(String file)`: generates points to be entered into `this` from a given .txt file. possibly also a .xml file.
  - **Secondary Methods**:
    - `double linearRegressionSlope()`: returns the slope of the linear regression for the points in `this`.
    - `double linearRegressionYIntercept()`: returns the y-intercept of the linear regression for the points in `this`.
    - `double meanX()`: returns the mean for the x values found in `this`.
    - `double meanY()`: returns the mean for the y values found in `this`.
    - `double standardDeviationX()`: returns the standard deviation for the x values found in `this`.
    - `double standardDeviationY()`: returns the standard deviation for the y values found in `this`.
    - `double minimumValueX()`: returns the minimum value of the x values found in `this`.
    - `double minimumValueY()`: returns the minimum value of the y values found in `this`.
    - `double maximumValueX()`: returns the minimum value of the x values found in `this`.
    - `double maximumValueY()`: returns the minimum value of the y values found in `this`.
    - `double tValueX()`: returns the t-value for the x values found in `this`.
    - `double tValueY()`: returns the t-value for the y values found in `this`.
    - `double zValueX()`: returns the z-value for the x values found in `this`.
    - `double zValueY()`: returns the z-value for the y values found in `this`.
    - `double rSquared()`: returns the R^2 for the points in `this`.
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, making this component mutable would make the implementation of this
        component much easier and more intuitive to use. Functions like
        `addPoint()`, `labelX()`, `labelY()`, and `generatePoints()` would all
        mutate `this` in their own ways.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - Yes? I think I would need to store the labels for the data table in their
        own variable. Though I'm not sure as I feel like I should be able to create
        a way to store the labels without the use of an internal class.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Could possibly need to enumerate the corresponding p-values to t-values
        and z-values, though I assume I could also simply calculate for these
        instead.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes, for example, the `meanX()` function could be implemented by finding
        the average of the array returned by `getXValues()`.

- Component Design #3: `Projectile`
  - **Description**:
    - Describes the motion of a projectile after it has been launched given
      an escape velocity and a launch angle.
  - **Kernel Methods**:
    - `void defineLaunchVelocity(double velocity)`: sets the launch velocity of the object described by `this`.
    - `void defineLaunchAngle(double angle)`: sets the launch angle with respect to the horizontal of `this`.
    - `double launchVelocity()`: returns the launch velocity of the object described by `this`.
    - `double launchAngle()`: returns the launch angle of the object described by `this`.
  - **Secondary Methods**:
    - `double getHorizontalVelocity()`: returns the horizontal velocity of the object described by `this`.
    - `double getInitialVerticalVelocity()`: returns the initial vertical velocity of the object described by `this`.
    - `double distanceTraveled()`: returns the distance that the object described by `this` traveled horizontally after being launched.
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, the functions defined above like `defineLaunchVelocity(double velocity)`
        would have to mutate `this` in order to work.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      - No, this component would be fairly simple, and wouldn't need any
        internal classes in order to function propperly.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      - Yes, there would need to be a constant for gravity to be defined as 9.81
        to allow for easier calculations.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes, the function `getHorizontalVelocity()` would make use of the
        `launchVelocity()` function to determine how fast the object described
        by this was moving horizontally after being launched.

## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Changelog

At the end of every assignment, you should update the
[CHANGELOG.md](../../CHANGELOG.md) file found in the root of the project folder.
Since this is likely the first time you've done this, we would recommend
browsing the existing file. It includes all of the changes made to the portfolio
project template. When you're ready, you should delete this file and start your
own. Here's what I would expect to see at the minimum:

```markdown
# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## 2026.02.05

### Added

- Designed a `Triangle` component
- Designed a `Data Table` component
- Designed a `Projectile` component
```

Here `YYYY.MM.DD` would be the date of your submission, such as 2024.04.21.

You may notice that things are nicely linked in the root CHANGELOG. If you'd
like to accomplish that, you will need to make GitHub releases after each pull
request merge (or at least tag your commits). This is not required.

In the future, the CHANGELOG will be used to document changes in your
designs, so we can gauge your progress. Please keep it updated at each stage
of development.

### Submission

If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting. For future assignments, you will
just be submitting a link to a pull request. This will be the only time
you have to submit any PDFs.

### Peer Review

Following the completion of this assignment, you will be assigned three
students' component brainstorming assignments for review. Your job during the
peer review process is to help your peers flesh out their designs. Specifically,
you should be helping them determine which of their designs would be most
practical to complete this semester. When reviewing your peers' assignments,
please treat them with respect. Note also that we can see your comments, which
could help your case if you're looking to become a grader. Ultimately, we
recommend using the following feedback rubric to ensure that your feedback is
both helpful and respectful (you may want to render the markdown as HTML or a
PDF to read this rubric as a table).

| Criteria of Constructive Feedback | Missing                                                                                                                           | Developing                                                                                                                                                                                                                                | Meeting                                                                                                                                                               |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Specific                          | All feedback is general (not specific)                                                                                            | Some (but not all) feedback is specific and some examples may be provided.                                                                                                                                                                | All feedback is specific, with examples provided where possible                                                                                                       |
| Actionable                        | None of the feedback provides actionable items or suggestions for improvement                                                     | Some feedback provides suggestions for improvement, while some do not                                                                                                                                                                     | All (or nearly all) feedback is actionable; most criticisms are followed by suggestions for improvement                                                               |
| Prioritized                       | Feedback provides only major or minor concerns, but not both. Major and minar concerns are not labeled or feedback is unorganized | Feedback provides both major and minor concerns, but it is not clear which is which and/or the feedback is not as well organized as it could be                                                                                           | Feedback clearly labels major and minor concerns. Feedback is organized in a way that allows the reader to easily understand which points to prioritize in a revision |
| Balanced                          | Feedback describes either strengths or areas of improvement, but not both                                                         | Feedback describes both strengths and areas for improvement, but it is more heavily weighted towards one or the other, and/or descusses both but does not clearly identify which part of the feedback is a strength/area for improvement  | Feedback provides balanced discussion of the document's strengths and areas for improvement. It is clear which piece of feedback is which                             |
| Tactful                           | Overall tone and language are not appropriate (e.g., not considerate, could be interpreted as personal criticism or attack)       | Overall feedback tone and language are general positive, tactul, and non-threatening, but one or more feedback comments could be interpretted as not tactful and/or feedback leans toward personal criticism, not focused on the document | Feedback tone and language are positive, tactful, and non-threatening. Feedback addesses the document, not the writer                                                 |

### Assignment Feedback

If you'd like to give feedback for this assignment (or any assignment, really),
make use of [this survey][survey]. Your feedback helps make assignments
better for future students.

[example-components]: https://therenegadecoder.com/code/the-never-ending-list-of-small-programming-project-ideas/
[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
[survey]: https://forms.gle/dumXHo6A4Enucdkq9
