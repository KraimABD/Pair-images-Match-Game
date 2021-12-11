package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


/*
        The ability to control oneself and curb one’s desire is very important to achieving goals and success in life
 */


public class Game extends JFrame implements ActionListener {


    private static int counter = 0;
    Boolean Enablbtns=true;


    int hits;
    int misses;
    int score;
    String result;
    JPanel jPanelBorder;
    JPanel jPanelGrid;
    JPanel jPanel,jPanel2,jPanel3;
    JLabel Hit,Miss,Score;
    Map<Integer, JButton> buttons;
    JButton retry;
    JButton newGame;
    Random random;
    ArrayList<Object> actions = new ArrayList<>();
    ArrayList<Integer> rands = new ArrayList<>();
    Map<Integer, ImageIcon> images = new HashMap<>();
    Map<Integer, ImageIcon> ensasMap = new HashMap<>();
    ArrayList<Integer> choices = new ArrayList<>();



    JButton btn1=new JButton();

    public void RandomImages(){
        hits =misses= score =0;
        Hit.setText("Hits = "+hits);
        Score.setText("Score = "+score+"/12");
        Miss.setText("Misses = "+misses);

        jPanelGrid.removeAll();
        int x = 0;
        int rand = random.nextInt(12);
        for (int i = 0; i < 2; i++) {
            Set exSet = new HashSet();
            for (int k = 0; k < 12; k++) {
                buttons.put(x,new JButton(images.get(rand)));
                x = x + 1;
                rands.add(rand);
                do {
                    if (!exSet.contains(rand)) {
                        exSet.add(rand);
                    }
                    rand = random.nextInt(12);
                } while (exSet.contains(rand) && (exSet.size() != 12));
            }
        }

        for (int i = 0; i <= 23; i++) {
            jPanelGrid.add(buttons.get(i));
        }
    }

    Game() {


        jPanelBorder = (JPanel) getContentPane();
        jPanelBorder.setLayout(new BorderLayout());

        jPanelGrid = new JPanel(new GridLayout(4, 6, 5, 5));
        Hit = new JLabel("Hits = "+hits);
        Miss = new JLabel("Misses = "+misses);
        Score = new JLabel("Score = "+score+"/12");

        jPanel = new JPanel(new FlowLayout());
        jPanel2 = new JPanel(new FlowLayout());

        jPanel2.add(Hit);
        jPanel2.add(Score);
        jPanel2.add(Miss);

        buttons = new HashMap<>();


        retry = new JButton("Retry");
        retry.addActionListener(this);
        newGame = new JButton("New Game");
        newGame.addActionListener(this);

        jPanel.add(retry);
        jPanel.add(newGame);

        jPanelBorder.add(jPanelGrid, BorderLayout.CENTER);
        jPanelBorder.add(jPanel, BorderLayout.SOUTH);
        jPanelBorder.add(jPanel2, BorderLayout.NORTH);

        random = new Random();

        for(int k=0;k<12;k++)ensasMap.put(k, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\ENSAS0.png"));

        images.put(1, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Benzima.png"));
        images.put(2, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Cris.jpg"));
        images.put(3, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Cris2.png"));
        images.put(4, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Cris3.png"));
        images.put(5, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\download.jpg"));
        images.put(6, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Kaka.jpg"));
        images.put(7, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Marcelo.png"));
        images.put(8, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\messi.jpg"));
        images.put(9, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Ozil.png"));
        images.put(10, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Puth.jpg"));
        images.put(11, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Ronaldo.png"));
        images.put(0, new ImageIcon("C:\\Users\\kraym\\IdeaProjects\\SwingTP1\\src\\com\\company\\Images\\Gorondo.png"));


        RandomImages();




        this.setTitle("Class Anonyme");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 700);
        this.setVisible(true);
        this.setResizable(true);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= 23; i++) {
//           buttons.get(i).setIcon(ensasMap.get(rands.get(i)));
            buttons.get(i).setIcon(ensasMap.get(0));
            buttons.get(i).addActionListener(this);
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //buttons.get(0).setIcon(images.get(rands.get(0)));
        System.out.println("hello");

    }







    @Override
    public void actionPerformed(ActionEvent e) {
        if (newGame == e.getSource()){
            System.out.println("hello");
            rands.clear();
            choices.clear();
            actions.clear();
            buttons.clear();
            RandomImages();


            this.setTitle("Class Anonyme");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(800, 700);
            this.setVisible(true);
            this.setResizable(true);

            try {
                TimeUnit.SECONDS.sleep(15);
            } catch (InterruptedException eee) {
                eee.printStackTrace();
            }

            for (int i = 0; i <= 23; i++) {
//           buttons.get(i).setIcon(ensasMap.get(rands.get(i)));
                buttons.get(i).setIcon(ensasMap.get(0));
                buttons.get(i).addActionListener(this);
            }



            //buttons.get(0).setIcon(images.get(rands.get(0)));
            System.out.println("hello");


        } else if (retry == e.getSource()){
            System.out.println("hello cccc");
            for (int i = 0; i < 24; i++) {
                buttons.get(i).setIcon(ensasMap.get(0));
            }
            hits=score=misses=0;
            Hit.setText("Hits = "+hits);
            Score.setText("Score = "+score+"/12");
            Miss.setText("Misses = "+misses);

        }else {
        if (Enablbtns) {

            int k = 0;
            for (int i = 0; i < 24; i++) {
                if (buttons.get(i) == e.getSource()) {
                    k = i;
                    break;
                }
            }
            btn1 = buttons.get(k);
            btn1.setIcon(images.get(rands.get(k)));
            actions.add(buttons.get(k).getIcon());
            choices.add(k);
            System.out.println(actions);
            k = 0;
            CompletableFuture.runAsync(() -> {
                if (actions.size() == 2) {
                    hits++;
                    Hit.setText("Hits = "+hits);
                    Enablbtns = false;
                    if (actions.get(0) == actions.get(1)) {
                        result = "Success";

                        score++;
                        Score.setText("Score = "+score+"/12");
                        System.out.println(result);
                        actions.clear();
                        choices.clear();
                    } else {
                        result = "Failed";
                        System.out.println(result);
                        misses++;
                        Miss.setText("Misses = "+misses);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        for (int j = 0; j < choices.size(); j++)
                            buttons.get(choices.get(j)).setIcon(ensasMap.get(0));

                        actions.clear();
                        choices.clear();
                    }
                    Enablbtns = true;
                }
            });
        }}
    }
}
