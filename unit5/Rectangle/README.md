# The Rectangle Class

## Goal
This activity will give us practice writing class variables, constructors, and methods in a more simplified context than the Pong project. The purpose of the Rectangle class is to create instances that represent orthogonal (not rotated) rectangles in a 2D graphics environment with integer coordinates.

![instances](https://i.imgur.com/QVw9mJ7.png)

## Attributes
Declare the following attributes. Determine if any should be static and/or final. Declare each as either public or private (Remember, only static final attributes should be made public).

* **x:** the x-coordinate of the left edge of the rectangle.
* **y:** the y-coordinate of the top edge of the rectangle.
* **width:** width of the rectangle.
* **height:** height of the rectangle.
* **rectCount:** tracks the number of rectangles that have been constructed.
* **MAX_WIDTH:** the maximum allowable width for all rectangles, set to 1000.
* **MAX_HEIGHT:** the maximum allowable height for all rectangles, set to 500.
* **MIN_DIM:** the minimum allowable dimension for all rectangles, set to 1.

## Constructors
Declare the following 4 constructors. 
* **Constructor #1:** If a user passes no parameters to the constructor we will set the dimensions of the rectangle to half their max values. We will place the rectangle at (0, 0). Increment the rectCount variable.
* **Constructor #2:** If a user passes a single integer, we will assume the rectangle is a square and set both dimensions to the given value. If the dimension is less than MIN_DIM, set it to MIN_DIM. If it is larger than the MAX, set it to the cooresponding MAX. We will place the rectangle at (0, 0). Increment the rectCount variable.
* **Constructor #3:** If a user passes two integers, they will represent the width and height respectively. Clean up the dimension data as done in constructor 2. We will place the rectangle at (0, 0). Increment the rectCount variable.
* **Constructor #4:** If a user passes four integers, they will represent x, y, width, and height respectively. Validate that the entire rectangle will fit in the 1000 by 500 world. Shrink the width and height as needed to fit. For example, if we're given a constructor call `new Rectangle(900, 100, 200, 500)`, the rectangle will over hang both the bottom and right edges by 100px. Our constructor will opt to keep the rectangle at (900, 100) but shrink width to 100 and height to 400 in this case. Increment the rectCount variable.

## Getters

* **getRectCount:** returns the number of rectangles constructed.
* **getX:** write a getter for the x coordinate. 

## Setters

* **setX:** write a method that will only set the x coordinate of a rectangle if it will still fit in the 1000x500 world. If it won't fit, don't change x, print a message that the x is invalid
* **setY:** same as setX, except in the y-axis.

## Instance Methods

* **getPerimeter:** write a method that returns the perimeter of a rectangle instance.
* **getArea:** write a method that returns the area of a rectangle instance.
* **isInteriorPoint:** write a method that takes in 2 integers px and py representing a point located at (px, py). Return whether or not this point is inside the rectangle. Do not include border points.

## Main Class

* Create at least 1 rectangle using each of the 4 constructors. Test each of your methods and verify they are working correctly.
