# Calculate area of circle, ellipse 
(cannot use formula πr<sup>2</sup> and πab)

## Calculate area of circle

Write a program to approximate the area under a
circle with radius r. Note that you should forget the existence of the well known formula area = πr<sup>2</sup>.

![Alt text](https://github.com/lavivien-cs-projects/CalculateAreaOfCircleNotUsePi/blob/master/circle_area.jpg?raw=true "Title")

**Method**: The equation of a circles with radius r, centered at origin is x2 + y2 = r2.
Divide the area under the first quadrant in to small rectangles of width of your choice
(dx) { smaller the better { and add these areas of all these rectangles to approximate the
area of one quarter of the circle. You should pass radius (r) and the width of the above
small rectangles (dx) as parameters. Instead of the width of those small rectangles, you
can pass the number of rectangles you want - say, n . Once you have the area of one quadrant, multiply that value
by 4 to get the area of the circle. Your method should return that value. In other words,
your method takes two input and return the area.

## Calculate area of ellipse

Write a program to approximate the area under an
ellipse centered at origin. Assume major axis and minor axis lengths are 2a
and 2b respectively. Note that you should forget the existence of the well
known formula area = πab.

![Alt text](https://github.com/lavivien-cs-projects/CalculateAreaOfCircleNotUsePi/blob/master/ellipse_area.jpg?raw=true "Title")

**Method**: The equation of such an ellipse centered at origin is as follows.

![Alt text](https://github.com/lavivien-cs-projects/CalculateAreaOfCircleNotUsePi/blob/master/ellipse_formula.jpg?raw=true "Title")

Divide the area under the first quadrant in to small rectangles of your
choice – smaller the better and you should pass this as a parameter to your
method (or you can pass number of small rectangles, and then calculate the
width of the rectangle inside the method), in addition to a and b– and add
these areas of all these rectangles to approximate the area of one quarter of
the ellipse. Multiplying that value by four give the approximate area of the
ellipse. You must test your results with known a and b values (especially,
test with a = 1 and b = 1 and you should see π as the area).








