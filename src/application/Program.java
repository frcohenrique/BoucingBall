package application;

import entities.Ball;

public class Program {

	public static void main(String[] args) {

		Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
		System.out.println(ball); // toString()

		ball.setX(80.0f);
		ball.setY(35.0f);
		ball.setRadius(5);
		ball.setXDelta(4.0f);
		ball.setYDelta(6.0f);
		System.out.println(ball);
		System.out.println("X is: " + ball.getX());
		System.out.println("Y is: " + ball.getY());
		System.out.println("Radius is: " + ball.getRadius());
		System.out.println("Delta X is: " + ball.getXDelta());
		System.out.println("Delta Y is: " + ball.getYDelta());

		float xMin = 0.0f;
		float xMax = 100.0f;
		float yMin = 0.0f;
		float yMax = 50.0f;

		for (int i = 0; i < 15; i++) {
			ball.move();
			System.out.println(ball);
			float xNew = ball.getX();
			float yNew = ball.getY();
			int radius = ball.getRadius();

			if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
				ball.reflectHorizontal();
			}
			if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
				ball.reflextVertical();
			}
		}
	}

}
