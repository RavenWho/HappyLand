/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.clockManager;
import static java.lang.Integer.parseInt;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali Sbiaa
 */
public class GameContainer extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form GameContainer
     */
  
    public String name;
    public String age;
    public GameContainer() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_cards = new javax.swing.JPanel();
        welcome_panel = new javax.swing.JPanel();
        start_button = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        description_button = new javax.swing.JButton();
        credits_button = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        start_panel = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        return_button = new javax.swing.JButton();
        start_button2 = new javax.swing.JButton();
        age_input = new javax.swing.JTextField();
        name_input = new javax.swing.JTextField();
        description_panel = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        return_button1 = new javax.swing.JButton();
        credits_panel = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        return_button2 = new javax.swing.JButton();
        ali_label = new javax.swing.JLabel();
        ali_label1 = new javax.swing.JLabel();
        game_container_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timer_panel = new javax.swing.JPanel();
        timer_string = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("main_frame"); // NOI18N
        setResizable(false);

        panel_cards.setMaximumSize(new java.awt.Dimension(750, 520));
        panel_cards.setMinimumSize(new java.awt.Dimension(750, 520));
        panel_cards.setPreferredSize(new java.awt.Dimension(750, 520));
        panel_cards.setLayout(new java.awt.CardLayout());

        welcome_panel.setBackground(new java.awt.Color(29, 53, 87));
        welcome_panel.setPreferredSize(new java.awt.Dimension(750, 520));

        start_button.setBackground(new java.awt.Color(241, 250, 238));
        start_button.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        start_button.setText("Start");
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(168, 218, 220));
        jTextField1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Happy Land");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        description_button.setBackground(new java.awt.Color(241, 250, 238));
        description_button.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        description_button.setText("Description");
        description_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                description_buttonActionPerformed(evt);
            }
        });

        credits_button.setBackground(new java.awt.Color(241, 250, 238));
        credits_button.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        credits_button.setText("Credits");
        credits_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits_buttonActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Mute");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcome_panelLayout = new javax.swing.GroupLayout(welcome_panel);
        welcome_panel.setLayout(welcome_panelLayout);
        welcome_panelLayout.setHorizontalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcome_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(welcome_panelLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(credits_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(welcome_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton1)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        welcome_panelLayout.setVerticalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcome_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(start_button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(description_button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(credits_button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(27, 27, 27))
        );

        panel_cards.add(welcome_panel, "card2");

        start_panel.setBackground(new java.awt.Color(29, 53, 87));
        start_panel.setPreferredSize(new java.awt.Dimension(750, 520));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(168, 218, 220));
        jTextField3.setFont(new java.awt.Font("Microsoft Tai Le", 0, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Happy Land");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 1, true));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        return_button.setBackground(new java.awt.Color(241, 250, 238));
        return_button.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        return_button.setText("Return");
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });

        start_button2.setBackground(new java.awt.Color(241, 250, 238));
        start_button2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        start_button2.setText("Start");
        start_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_button2ActionPerformed(evt);
            }
        });

        age_input.setBackground(new java.awt.Color(241, 250, 238));
        age_input.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        age_input.setText("Age");
        age_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_inputActionPerformed(evt);
            }
        });

        name_input.setBackground(new java.awt.Color(241, 250, 238));
        name_input.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_input.setText("Name");
        name_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout start_panelLayout = new javax.swing.GroupLayout(start_panel);
        start_panel.setLayout(start_panelLayout);
        start_panelLayout.setHorizontalGroup(
            start_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(start_panelLayout.createSequentialGroup()
                .addGroup(start_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(start_panelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(start_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(start_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, start_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(start_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_input, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(299, 299, 299))
        );
        start_panelLayout.setVerticalGroup(
            start_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, start_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(age_input, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(start_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        panel_cards.add(start_panel, "card3");

        description_panel.setBackground(new java.awt.Color(29, 53, 87));
        description_panel.setPreferredSize(new java.awt.Dimension(750, 520));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(168, 218, 220));
        jTextField4.setFont(new java.awt.Font("Microsoft Tai Le", 0, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Description");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 1, true));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        return_button1.setBackground(new java.awt.Color(241, 250, 238));
        return_button1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        return_button1.setText("Return");
        return_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout description_panelLayout = new javax.swing.GroupLayout(description_panel);
        description_panel.setLayout(description_panelLayout);
        description_panelLayout.setHorizontalGroup(
            description_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(description_panelLayout.createSequentialGroup()
                .addGroup(description_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(description_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(description_panelLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(return_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        description_panelLayout.setVerticalGroup(
            description_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, description_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(return_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        panel_cards.add(description_panel, "card3");

        credits_panel.setBackground(new java.awt.Color(29, 53, 87));
        credits_panel.setPreferredSize(new java.awt.Dimension(750, 520));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(168, 218, 220));
        jTextField5.setFont(new java.awt.Font("Microsoft Tai Le", 0, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Credits");
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 123, 157), 1, true));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        return_button2.setBackground(new java.awt.Color(241, 250, 238));
        return_button2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        return_button2.setText("Return");
        return_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_button2ActionPerformed(evt);
            }
        });

        ali_label.setBackground(new java.awt.Color(69, 123, 157));
        ali_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ali_label.setForeground(new java.awt.Color(241, 250, 238));
        ali_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ali_label.setText("Ali - CN4F59");
        ali_label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        ali_label.setOpaque(true);

        ali_label1.setBackground(new java.awt.Color(69, 123, 157));
        ali_label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ali_label1.setForeground(new java.awt.Color(241, 250, 238));
        ali_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ali_label1.setText("Furkat - C44JC0");
        ali_label1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        ali_label1.setOpaque(true);

        javax.swing.GroupLayout credits_panelLayout = new javax.swing.GroupLayout(credits_panel);
        credits_panel.setLayout(credits_panelLayout);
        credits_panelLayout.setHorizontalGroup(
            credits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credits_panelLayout.createSequentialGroup()
                .addGroup(credits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(credits_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(credits_panelLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(return_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(credits_panelLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(credits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ali_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ali_label, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        credits_panelLayout.setVerticalGroup(
            credits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credits_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ali_label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ali_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(return_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        panel_cards.add(credits_panel, "card3");

        game_container_panel.setBackground(new java.awt.Color(29, 53, 87));
        game_container_panel.setPreferredSize(new java.awt.Dimension(750, 520));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Map");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        timer_string.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        timer_string.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timer_string.setText("Timer");

        javax.swing.GroupLayout timer_panelLayout = new javax.swing.GroupLayout(timer_panel);
        timer_panel.setLayout(timer_panelLayout);
        timer_panelLayout.setHorizontalGroup(
            timer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timer_panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(timer_string, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(timer_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        timer_panelLayout.setVerticalGroup(
            timer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timer_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(timer_string, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout game_container_panelLayout = new javax.swing.GroupLayout(game_container_panel);
        game_container_panel.setLayout(game_container_panelLayout);
        game_container_panelLayout.setHorizontalGroup(
            game_container_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game_container_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(game_container_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timer_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        game_container_panelLayout.setVerticalGroup(
            game_container_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(game_container_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(game_container_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(game_container_panelLayout.createSequentialGroup()
                        .addComponent(timer_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_cards.add(game_container_panel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return_to_WP() {
        panel_cards.removeAll();
        panel_cards.add(welcome_panel);
        panel_cards.repaint();
        panel_cards.revalidate();
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        // TODO add your handling code here:
        panel_cards.removeAll();
        panel_cards.add(start_panel);
        panel_cards.repaint();
        panel_cards.revalidate();
    }//GEN-LAST:event_start_buttonActionPerformed

    private void description_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_description_buttonActionPerformed
        // TODO add your handling code here:
        panel_cards.removeAll();
        panel_cards.add(description_panel);
        panel_cards.repaint();
        panel_cards.revalidate();
    }//GEN-LAST:event_description_buttonActionPerformed

    private void credits_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits_buttonActionPerformed
        // TODO add your handling code here:
        panel_cards.removeAll();
        panel_cards.add(credits_panel);
        panel_cards.repaint();
        panel_cards.revalidate();
    }//GEN-LAST:event_credits_buttonActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // TODO add your handling code here:
        return_to_WP();
    }//GEN-LAST:event_return_buttonActionPerformed

    private void start_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_button2ActionPerformed
        // TODO add your handling code here:
        if (age_input.getText().isEmpty() || name_input.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Please enter all filds !");
        } else {
            name = name_input.getText().trim();
            age = age_input.getText().trim();
            jTextField2.setText(name);
            panel_cards.removeAll();
            panel_cards.add(game_container_panel);
            panel_cards.repaint();
            panel_cards.revalidate();
            
        }

    }//GEN-LAST:event_start_button2ActionPerformed

    private void age_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_inputActionPerformed

    }//GEN-LAST:event_age_inputActionPerformed

    private void name_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_inputActionPerformed

    }//GEN-LAST:event_name_inputActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void return_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_button1ActionPerformed
        // TODO add your handling code here:
        return_to_WP();
    }//GEN-LAST:event_return_button1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void return_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_button2ActionPerformed
        // TODO add your handling code here:
        return_to_WP();
    }//GEN-LAST:event_return_button2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameContainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_input;
    private javax.swing.JLabel ali_label;
    private javax.swing.JLabel ali_label1;
    private javax.swing.JButton credits_button;
    private javax.swing.JPanel credits_panel;
    private javax.swing.JButton description_button;
    private javax.swing.JPanel description_panel;
    private javax.swing.JPanel game_container_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField name_input;
    private javax.swing.JPanel panel_cards;
    private javax.swing.JButton return_button;
    private javax.swing.JButton return_button1;
    private javax.swing.JButton return_button2;
    private javax.swing.JButton start_button;
    private javax.swing.JButton start_button2;
    private javax.swing.JPanel start_panel;
    private javax.swing.JPanel timer_panel;
    private javax.swing.JLabel timer_string;
    private javax.swing.JPanel welcome_panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        clockManager clockManager = new clockManager();
        String output;
        while (true) {
            DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss")
                    .withZone(ZoneId.systemDefault());

            output = DATE_TIME_FORMATTER.format(clockManager.instant());
            timer_string.setText(output);
        }
    }
}
