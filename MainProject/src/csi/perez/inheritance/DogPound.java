package csi.perez.inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;




public class DogPound extends JPanel implements ActionListener {

	List<Dog> dogs1 = new ArrayList<Dog>();

	private int B_WIDTH = 800;
	private int B_HEIGHT = 800;
	private int DOG_SIZE = 50;
	private int ALL_DOGS = 120;

	private final int x[] = new int[ALL_DOGS];
	private final int y[] = new int[ALL_DOGS];

	private int dogs;

	private boolean leftDirection = false;
	private boolean rightDirection = true;
	private boolean upDirection = false;
	private boolean downDirection = false;
	private boolean isRunning = true;

	private Timer timer;
	private final int DELAY = 140;

	private int count;


	
	public DogPound() {
		dogs1.add(new GoldenDoodle());
		initBoard();
	}

	private void initBoard() {

		addKeyListener(new TAdapter());
		setBackground(new Color(255, 255, 255));
		setFocusable(true);

		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		initSimulation();
	}

	private void initSimulation() {

		dogs = 1;

		for (int z = 0; z < dogs; z++) {
			x[z] = 50 - z * 10;
			y[z] = 50;
		}

		timer = new Timer(DELAY, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrawing(g);
	}

	private void doDrawing(Graphics g) {

		if (isRunning) {
			for (int z = 0; z < dogs; z++) {
				if (z == 0) {
					g.drawImage(dogs1.get(0).icon.getImage(), x[z], y[z], this);
				} else {
					g.drawImage(dogs1.get(0).icon.getImage(), x[z], y[z], this);
				}
			}
			Toolkit.getDefaultToolkit().sync();
		
		}

	}


	private void move() {

        for (int z = dogs; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            x[0] -= DOG_SIZE;
        }

        if (rightDirection) {
            x[0] += DOG_SIZE;
        }

        if (upDirection) {
            y[0] -= DOG_SIZE;
        }

        if (downDirection) {
            y[0] += DOG_SIZE;
        }
    }

	 private void checkCollision() {

	        for (int z = dogs; z > 0; z--) {

	            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
	                
	            }
	        }

	        if (y[0] >= B_HEIGHT) {
	        }

	        if (y[0] < 0) {
	        }

	        if (x[0] >= B_WIDTH) {
	        }

	        if (x[0] < 0) {
	        }
	        
	     
	    }

	
	 @Override
	   public void actionPerformed(ActionEvent e) {

	        if (isRunning) {
	            checkCollision();
	            move();
	        }
	        repaint();
	    }
	 
	private class TAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

			int key = e.getKeyCode();

			if ((key == KeyEvent.VK_S) && (!upDirection)) {
				downDirection = true;
				rightDirection = false;
				leftDirection = false;
			}

			if ((key == KeyEvent.VK_A) && (!rightDirection)) {
				leftDirection = true;
				upDirection = false;
				downDirection = false;
			}

			if ((key == KeyEvent.VK_D) && (!leftDirection)) {
				rightDirection = true;
				upDirection = false;
				downDirection = false;
			}

			if ((key == KeyEvent.VK_W) && (!downDirection)) {
				upDirection = true;
				rightDirection = false;
				leftDirection = false;
			}
			if ((key == KeyEvent.VK_ENTER && (!isRunning))) {

			}
		}
	}


		
	}

