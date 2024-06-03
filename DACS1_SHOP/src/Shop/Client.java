package Shop;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;

public class Client extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private ImageIcon[] images;
    private int currentImageIndex = 0;
    private JLabel lblSlideshow;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Client frame = new Client();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Client() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1071, 882);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 993, 725);
        panel.setLayout(null);

        // Add the panel to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 1023, 1023); // Adjust this size as needed
        contentPane.add(scrollPane);

        // Set preferred size for panel to ensure scroll bars appear
        panel.setPreferredSize(new Dimension(993, 1500)); // Change height as needed

        images = new ImageIcon[]{
            new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\ZA_2324KitLaunch_411698065523971_large (1).jpg"),
            new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\giay-manchester-united-adidas-stretford-1968-shoes-s79508-bnwt-box-20211030054430-665309 (1).jpg")
        };

        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setIcon(images[currentImageIndex]);
        lblNewLabel_8.setBounds(254, 133, 737, 206);
        panel.add(lblNewLabel_8);

        // Timer to switch images
        Timer timer = new Timer(3000, new ActionListener() { // Switch every 3 seconds
            @Override
            public void actionPerformed(ActionEvent e) {
                currentImageIndex = (currentImageIndex + 1) % images.length;
                lblNewLabel_8.setIcon(images[currentImageIndex]);
            }
        });
        timer.start();

        JLabel lblNewLabel_2 = new JLabel("Man United Sports");
        lblNewLabel_2.setForeground(new Color(255, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 24));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(54, 4, 234, 58);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setBounds(611, 13, 37, 49);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 7));
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-search-50 (1) (1).png"));

        textField = new JTextField();
        textField.setBounds(293, 13, 308, 45);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-shopping-cart-52.png"));
        lblNewLabel_4.setBounds(799, 13, 66, 49);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("0");
        lblNewLabel_5.setBackground(new Color(255, 0, 0));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setForeground(new Color(0, 0, 0));
        lblNewLabel_5.setBounds(835, 0, 50, 35);
        panel.add(lblNewLabel_5);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 0, 0));
        panel_2.setBounds(0, 72, 991, 58);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel = new JLabel("DANH MỤC SẢN PHẨM");
        lblNewLabel.setBackground(new Color(252, 47, 3));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(63, 0, 191, 58);
        panel_2.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-tiles-48.png"));
        lblNewLabel_1.setBounds(10, 0, 52, 58);
        panel_2.add(lblNewLabel_1);

        JButton btnNewButton_4_1 = new JButton("Giày");
        btnNewButton_4_1.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_4_1.setOpaque(true);
        btnNewButton_4_1.setContentAreaFilled(true);
        btnNewButton_4_1.setBorderPainted(false);
        btnNewButton_4_1.setBackground(Color.RED);
        btnNewButton_4_1.setBounds(295, 0, 118, 58);
        panel_2.add(btnNewButton_4_1);
        
        btnNewButton_4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client clientGiayFrame = new Client();
                clientGiayFrame.setVisible(true);
            }
        });

        JButton btnNewButton_4_1_1 = new JButton("Quần áo");
        btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_1_1.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1_1.setOpaque(true);
        btnNewButton_4_1_1.setContentAreaFilled(true);
        btnNewButton_4_1_1.setBorderPainted(false);
        btnNewButton_4_1_1.setBackground(Color.RED);
        btnNewButton_4_1_1.setBounds(422, 0, 130, 58);
        panel_2.add(btnNewButton_4_1_1);
        
        btnNewButton_4_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                ClientQuanAo clientQuanAoFrame = new ClientQuanAo();
                clientQuanAoFrame.setVisible(true);
            }
        });

        // Add the button to the panel
        

        JButton btnNewButton_4_1_2 = new JButton("Bóng đá");
        btnNewButton_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_1_2.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1_2.setOpaque(true);
        btnNewButton_4_1_2.setContentAreaFilled(true);
        btnNewButton_4_1_2.setBorderPainted(false);
        btnNewButton_4_1_2.setBackground(Color.RED);
        btnNewButton_4_1_2.setBounds(551, 0, 130, 58);
        panel_2.add(btnNewButton_4_1_2);
        
        btnNewButton_4_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                ClientBongDa clientBongDaFrame = new ClientBongDa();
                clientBongDaFrame.setVisible(true);
            }
        });

        JButton btnNewButton_4_1_3 = new JButton("Phụ kiện");
        btnNewButton_4_1_3.setForeground(new Color(255, 255, 255));
        btnNewButton_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_4_1_3.setOpaque(true);
        btnNewButton_4_1_3.setContentAreaFilled(true);
        btnNewButton_4_1_3.setBorderPainted(false);
        btnNewButton_4_1_3.setBackground(Color.RED);
        btnNewButton_4_1_3.setBounds(684, 0, 130, 58);
        panel_2.add(btnNewButton_4_1_3);
        
        btnNewButton_4_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                ClientPhuKien clientPhuKienFrame = new ClientPhuKien();
                clientPhuKienFrame.setVisible(true);
            }
        });

        JLabel lblNewLabel_9 = new JLabel("HOTLINE :0905169648");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_9.setForeground(new Color(255, 255, 255));
        lblNewLabel_9.setBounds(790, 2, 201, 58);
        panel_2.add(lblNewLabel_9);

        JLabel lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\Header-Logo1500994616801 (1) (2).png"));
        lblNewLabel_7.setBounds(21, 13, 66, 48);
        panel.add(lblNewLabel_7);

        JButton btnNewButton = new JButton("Giày");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton.setBounds(10, 133, 234, 49);
        btnNewButton.setBackground(Color.RED); // Set background color to red
        btnNewButton.setOpaque(true); // Ensure the button is opaque
        btnNewButton.setBorderPainted(false); // Optional: remove border
        btnNewButton.setContentAreaFilled(true); // Ensure the button fills the content area
        panel.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                Client clientGiayFrame = new Client();
                clientGiayFrame.setVisible(true);
            }
        });

        JButton btnNewButton_1 = new JButton("Phụ kiện");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setOpaque(true);
        btnNewButton_1.setContentAreaFilled(true);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBackground(Color.RED);
        btnNewButton_1.setBounds(10, 291, 234, 49);
        panel.add(btnNewButton_1);
        
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                ClientPhuKien clientPhuKienFrame = new ClientPhuKien();
                clientPhuKienFrame.setVisible(true);
            }
        });

        JButton btnNewButton_2 = new JButton("Quần áo");
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_2.setOpaque(true);
        btnNewButton_2.setContentAreaFilled(true);
        btnNewButton_2.setBorderPainted(false);
        btnNewButton_2.setBackground(Color.RED);
        btnNewButton_2.setBounds(10, 186, 234, 49);
        panel.add(btnNewButton_2);
        
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                ClientQuanAo clientQuanAoFrame = new ClientQuanAo();
                clientQuanAoFrame.setVisible(true);
            }
        });

        JButton btnNewButton_3 = new JButton("Bóng đá");
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setOpaque(true);
        btnNewButton_3.setContentAreaFilled(true);
        btnNewButton_3.setBorderPainted(false);
        btnNewButton_3.setBackground(Color.RED);
        btnNewButton_3.setBounds(10, 239, 234, 49);
        panel.add(btnNewButton_3);
        
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open ClientQuanAo frame
                ClientBongDa clientBongDaFrame = new ClientBongDa();
                clientBongDaFrame.setVisible(true);
            }
        });
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(10, 373, 249, 307);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_11 = new JLabel("");
        lblNewLabel_11.setBounds(94, 5, 45, 13);
        panel_1.add(lblNewLabel_11);
        
                JLabel lblNewLabel_10 = new JLabel("");
                lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\manchester-united-cup-home-shirt-2023-24-with-mainoo-37-printing_ss5_p-14408752+u-4dtuau9mzefjl9ewjv7n+v-g1ymmp8bjxcmcmxq2ywe (1).jpg"));
                lblNewLabel_10.setBounds(30, 5, 194, 200);
                panel_1.add(lblNewLabel_10);
                
                JLabel lblNewLabel_12 = new JLabel("Áo Kobbie-Mainno");
                lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12.setBounds(56, 215, 127, 22);
                panel_1.add(lblNewLabel_12);
                
                JCheckBox chckbxNewCheckBox = new JCheckBox("S");
                chckbxNewCheckBox.setBounds(21, 236, 36, 21);
                panel_1.add(chckbxNewCheckBox);
                
                JCheckBox chckbxNewCheckBox_1 = new JCheckBox("L");
                chckbxNewCheckBox_1.setBounds(115, 236, 36, 21);
                panel_1.add(chckbxNewCheckBox_1);
                
                JCheckBox chckbxNewCheckBox_2 = new JCheckBox("XL");
                chckbxNewCheckBox_2.setBounds(165, 236, 45, 21);
                panel_1.add(chckbxNewCheckBox_2);
                
                JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("M");
                chckbxNewCheckBox_2_1.setBounds(66, 236, 36, 21);
                panel_1.add(chckbxNewCheckBox_2_1);
                
                // Create a ButtonGroup and add the checkboxes to it
                ButtonGroup group = new ButtonGroup();
                group.add(chckbxNewCheckBox);
                group.add(chckbxNewCheckBox_1);
                group.add(chckbxNewCheckBox_2);
                group.add(chckbxNewCheckBox_2_1);
                
                JLabel lblNewLabel_15 = new JLabel("1.999.999đ");
                lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15.setBounds(76, 262, 107, 13);
                panel_1.add(lblNewLabel_15);
                
                JButton btnNewButton_4 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4.setBackground(new Color(255, 0, 0));
                btnNewButton_4.setBounds(30, 285, 139, 21);
                panel_1.add(btnNewButton_4);
                
                JComboBox comboBox = new JComboBox();
                comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox.setBounds(181, 285, 43, 21);
                panel_1.add(comboBox);
                
                JPanel panel_3 = new JPanel();
                panel_3.setBackground(new Color(255, 0, 0));
                panel_3.setBounds(293, 374, 249, 35);
                panel.add(panel_3);
                panel_3.setLayout(null);
                
                JLabel lblNewLabel_13 = new JLabel("");
                lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-ranking-66 (1).png"));
                lblNewLabel_13.setBounds(0, 0, 45, 35);
                panel_3.add(lblNewLabel_13);
                
                JLabel lblNewLabel_14 = new JLabel("SẢN PHẨM BÁN CHẠY");
                lblNewLabel_14.setForeground(new Color(255, 255, 255));
                lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
                lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_14.setBounds(45, 0, 195, 35);
                panel_3.add(lblNewLabel_14);
                
                JButton btnNewButton_5 = new JButton("Giỏ Hàng");
                btnNewButton_5.setBackground(new Color(255, 0, 0));
                btnNewButton_5.setForeground(new Color(255, 255, 255));
                btnNewButton_5.setBounds(684, 17, 105, 45);
                panel.add(btnNewButton_5);
                
                JPanel panel_1_1 = new JPanel();
                panel_1_1.setLayout(null);
                panel_1_1.setBackground(Color.WHITE);
                panel_1_1.setBounds(303, 419, 211, 261);
                panel.add(panel_1_1);
                
                JLabel lblNewLabel_11_1 = new JLabel("");
                lblNewLabel_11_1.setBounds(94, 5, 45, 13);
                panel_1_1.add(lblNewLabel_11_1);
                
                JLabel lblNewLabel_10_1 = new JLabel("");
                lblNewLabel_10_1.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\Bong_Manchester_United_Club_DJo_GH0061 (1).png"));
                lblNewLabel_10_1.setBounds(10, 5, 193, 169);
                panel_1_1.add(lblNewLabel_10_1);
                
                JLabel lblNewLabel_12_1 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1.setBounds(56, 172, 127, 22);
                panel_1_1.add(lblNewLabel_12_1);
                
                JCheckBox chckbxNewCheckBox_3 = new JCheckBox("S");
                chckbxNewCheckBox_3.setBounds(14, 189, 36, 21);
                panel_1_1.add(chckbxNewCheckBox_3);
                
                JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("L");
                chckbxNewCheckBox_1_1.setBounds(113, 189, 36, 21);
                panel_1_1.add(chckbxNewCheckBox_1_1);
                
                JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2.setBounds(158, 189, 45, 21);
                panel_1_1.add(chckbxNewCheckBox_2_2);
                
                JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1.setBounds(66, 189, 36, 21);
                panel_1_1.add(chckbxNewCheckBox_2_1_1);
                
                ButtonGroup group1 = new ButtonGroup();
                group1.add(chckbxNewCheckBox_3);
                group1.add(chckbxNewCheckBox_1_1);
                group1.add(chckbxNewCheckBox_2_2);
                group1.add(chckbxNewCheckBox_2_1_1);
                
                JLabel lblNewLabel_15_1 = new JLabel("1.999.999đ");
                lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1.setBounds(56, 216, 107, 13);
                panel_1_1.add(lblNewLabel_15_1);
                
                JButton btnNewButton_4_2 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2.setBackground(Color.RED);
                btnNewButton_4_2.setBounds(10, 230, 139, 21);
                panel_1_1.add(btnNewButton_4_2);
                
                JComboBox comboBox_1 = new JComboBox();
                comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1.setBounds(160, 230, 43, 21);
                panel_1_1.add(comboBox_1);
                
                JPanel panel_1_1_1 = new JPanel();
                panel_1_1_1.setLayout(null);
                panel_1_1_1.setBackground(Color.WHITE);
                panel_1_1_1.setBounds(534, 419, 211, 261);
                panel.add(panel_1_1_1);
                
                JLabel lblNewLabel_11_1_1 = new JLabel("");
                lblNewLabel_11_1_1.setBounds(94, 5, 45, 13);
                panel_1_1_1.add(lblNewLabel_11_1_1);
                
                JLabel lblNewLabel_10_1_1 = new JLabel("");
                lblNewLabel_10_1_1.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\manchester-united-adidas-golf-cap-black-unisex_ss5_p-200938702+u-agbtpdll1oabvzskbatm+v-abluupkx3qq92uisdtak (1).png"));
                lblNewLabel_10_1_1.setBounds(10, 5, 193, 169);
                panel_1_1_1.add(lblNewLabel_10_1_1);
                
                JLabel lblNewLabel_12_1_1 = new JLabel("Mũ Man united");
                lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_1.setBounds(56, 172, 127, 22);
                panel_1_1_1.add(lblNewLabel_12_1_1);
                
                JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("S");
                chckbxNewCheckBox_3_1.setBounds(14, 189, 36, 21);
                panel_1_1_1.add(chckbxNewCheckBox_3_1);
                
                JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_1.setBounds(113, 189, 36, 21);
                panel_1_1_1.add(chckbxNewCheckBox_1_1_1);
                
                JCheckBox chckbxNewCheckBox_2_2_1 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_1.setBounds(158, 189, 45, 21);
                panel_1_1_1.add(chckbxNewCheckBox_2_2_1);
                
                JCheckBox chckbxNewCheckBox_2_1_1_1 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_1.setBounds(66, 189, 36, 21);
                panel_1_1_1.add(chckbxNewCheckBox_2_1_1_1);
                
                ButtonGroup group2 = new ButtonGroup();
                group2.add(chckbxNewCheckBox_3_1);
                group2.add(chckbxNewCheckBox_1_1_1);
                group2.add(chckbxNewCheckBox_2_2_1);
                group2.add(chckbxNewCheckBox_2_1_1_1);
                
                JLabel lblNewLabel_15_1_1 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_1.setBounds(56, 216, 107, 13);
                panel_1_1_1.add(lblNewLabel_15_1_1);
                
                JButton btnNewButton_4_2_1 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_1.setBackground(Color.RED);
                btnNewButton_4_2_1.setBounds(14, 230, 139, 21);
                panel_1_1_1.add(btnNewButton_4_2_1);
                
                JComboBox comboBox_2 = new JComboBox();
                comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_2.setBounds(160, 230, 43, 21);
                panel_1_1_1.add(comboBox_2);
                
                JPanel panel_1_1_2 = new JPanel();
                panel_1_1_2.setLayout(null);
                panel_1_1_2.setBackground(Color.WHITE);
                panel_1_1_2.setBounds(772, 419, 211, 261);
                panel.add(panel_1_1_2);
                
                JLabel lblNewLabel_11_1_2 = new JLabel("");
                lblNewLabel_11_1_2.setBounds(94, 5, 45, 13);
                panel_1_1_2.add(lblNewLabel_11_1_2);
                
                JLabel lblNewLabel_10_1_2 = new JLabel("");
                lblNewLabel_10_1_2.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\adidas-predator-elite-fg-kids_ss5_p-200893983+u-grezdfqlbapebj5s1pby+v-vb95bqoyfweuwj9grhhq (1).png"));
                lblNewLabel_10_1_2.setBounds(10, 5, 193, 169);
                panel_1_1_2.add(lblNewLabel_10_1_2);
                
                JLabel lblNewLabel_12_1_2 = new JLabel("Giày Adidas");
                lblNewLabel_12_1_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_2.setBounds(56, 172, 127, 22);
                panel_1_1_2.add(lblNewLabel_12_1_2);
                
                JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("S");
                chckbxNewCheckBox_3_2.setBounds(14, 189, 36, 21);
                panel_1_1_2.add(chckbxNewCheckBox_3_2);
                
                JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_2.setBounds(113, 189, 36, 21);
                panel_1_1_2.add(chckbxNewCheckBox_1_1_2);
                
                JCheckBox chckbxNewCheckBox_2_2_2 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_2.setBounds(158, 189, 45, 21);
                panel_1_1_2.add(chckbxNewCheckBox_2_2_2);
                
                JCheckBox chckbxNewCheckBox_2_1_1_2 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_2.setBounds(66, 189, 36, 21);
                panel_1_1_2.add(chckbxNewCheckBox_2_1_1_2);
                
                ButtonGroup group3 = new ButtonGroup();
                group3.add(chckbxNewCheckBox_3_2);
                group3.add(chckbxNewCheckBox_1_1_2);
                group3.add(chckbxNewCheckBox_2_2_2);
                group3.add(chckbxNewCheckBox_2_1_1_2);
                
                JLabel lblNewLabel_15_1_2 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_2.setBounds(56, 216, 107, 13);
                panel_1_1_2.add(lblNewLabel_15_1_2);
                
                JButton btnNewButton_4_2_2 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_2.setBackground(Color.RED);
                btnNewButton_4_2_2.setBounds(14, 230, 139, 21);
                panel_1_1_2.add(btnNewButton_4_2_2);
                
                JComboBox comboBox_3 = new JComboBox();
                comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_3.setBounds(160, 230, 43, 21);
                panel_1_1_2.add(comboBox_3);
                
                JPanel panel_4 = new JPanel();
                panel_4.setBackground(new Color(255, 0, 0));
                panel_4.setBounds(21, 702, 55, 49);
                panel.add(panel_4);
                panel_4.setLayout(null);
                
                JLabel lblNewLabel_6 = new JLabel("");
                lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\Header-Logo1500994616801 (1) (2).png"));
                lblNewLabel_6.setBounds(0, 5, 55, 40);
                panel_4.add(lblNewLabel_6);
                
                JPanel panel_5 = new JPanel();
                panel_5.setBackground(new Color(255, 0, 0));
                panel_5.setBounds(77, 702, 906, 4);
                panel.add(panel_5);
                
                JPanel panel_1_1_3 = new JPanel();
                panel_1_1_3.setLayout(null);
                panel_1_1_3.setBackground(Color.WHITE);
                panel_1_1_3.setBounds(21, 761, 211, 261);
                panel.add(panel_1_1_3);
                
                JLabel lblNewLabel_11_1_3 = new JLabel("");
                lblNewLabel_11_1_3.setBounds(94, 5, 45, 13);
                panel_1_1_3.add(lblNewLabel_11_1_3);
                
                JLabel lblNewLabel_10_1_3 = new JLabel("");
                lblNewLabel_10_1_3.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\adidas-predator-league-tf-kids_ss5_p-200893980+u-xhyxly4lxuu7xtuqkwka+v-8kwxjl4zbrxvmfnudqjk (1).png"));
                lblNewLabel_10_1_3.setBounds(10, 5, 193, 169);
                panel_1_1_3.add(lblNewLabel_10_1_3);
                
                JLabel lblNewLabel_12_1_3 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_3.setBounds(56, 172, 127, 22);
                panel_1_1_3.add(lblNewLabel_12_1_3);
                
                JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("S");
                chckbxNewCheckBox_3_3.setBounds(14, 189, 36, 21);
                panel_1_1_3.add(chckbxNewCheckBox_3_3);
                
                JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_3.setBounds(113, 189, 36, 21);
                panel_1_1_3.add(chckbxNewCheckBox_1_1_3);
                
                JCheckBox chckbxNewCheckBox_2_2_3 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_3.setBounds(158, 189, 45, 21);
                panel_1_1_3.add(chckbxNewCheckBox_2_2_3);
                
                JCheckBox chckbxNewCheckBox_2_1_1_3 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_3.setBounds(66, 189, 36, 21);
                panel_1_1_3.add(chckbxNewCheckBox_2_1_1_3);
                
                ButtonGroup group4 = new ButtonGroup();
                group4.add(chckbxNewCheckBox_3_3);
                group4.add(chckbxNewCheckBox_1_1_3);
                group4.add(chckbxNewCheckBox_2_2_3);
                group4.add(chckbxNewCheckBox_2_1_1_3);
                
                JLabel lblNewLabel_15_1_3 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_3.setBounds(56, 216, 107, 13);
                panel_1_1_3.add(lblNewLabel_15_1_3);
                
                JButton btnNewButton_4_2_3 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_3.setBackground(Color.RED);
                btnNewButton_4_2_3.setBounds(10, 230, 139, 21);
                panel_1_1_3.add(btnNewButton_4_2_3);
                
                JComboBox comboBox_1_1 = new JComboBox();
                comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_1.setBounds(160, 230, 43, 21);
                panel_1_1_3.add(comboBox_1_1);
                
                JPanel panel_1_1_4 = new JPanel();
                panel_1_1_4.setLayout(null);
                panel_1_1_4.setBackground(Color.WHITE);
                panel_1_1_4.setBounds(254, 761, 211, 261);
                panel.add(panel_1_1_4);
                
                JLabel lblNewLabel_11_1_4 = new JLabel("");
                lblNewLabel_11_1_4.setBounds(94, 5, 45, 13);
                panel_1_1_4.add(lblNewLabel_11_1_4);
                
                JLabel lblNewLabel_10_1_4 = new JLabel("");
                lblNewLabel_10_1_4.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\adidas-copa-pure-2-league-fg_ss5_p-200893977+u-jdvcporbpotikjal1vpx+v-bmannrifx6mn0ez9s7aw (1).png"));
                lblNewLabel_10_1_4.setBounds(10, 5, 193, 169);
                panel_1_1_4.add(lblNewLabel_10_1_4);
                
                JLabel lblNewLabel_12_1_4 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_4.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_4.setBounds(56, 172, 127, 22);
                panel_1_1_4.add(lblNewLabel_12_1_4);
                
                JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("S");
                chckbxNewCheckBox_3_4.setBounds(14, 189, 36, 21);
                panel_1_1_4.add(chckbxNewCheckBox_3_4);
                
                JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_4.setBounds(113, 189, 36, 21);
                panel_1_1_4.add(chckbxNewCheckBox_1_1_4);
                
                JCheckBox chckbxNewCheckBox_2_2_4 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_4.setBounds(158, 189, 45, 21);
                panel_1_1_4.add(chckbxNewCheckBox_2_2_4);
                
                JCheckBox chckbxNewCheckBox_2_1_1_4 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_4.setBounds(66, 189, 36, 21);
                panel_1_1_4.add(chckbxNewCheckBox_2_1_1_4);
                
                ButtonGroup group5 = new ButtonGroup();
                group5.add(chckbxNewCheckBox_3_4);
                group5.add(chckbxNewCheckBox_1_1_4);
                group5.add(chckbxNewCheckBox_2_2_4);
                group5.add(chckbxNewCheckBox_2_1_1_4);
                
                JLabel lblNewLabel_15_1_4 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_4.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_4.setBounds(56, 216, 107, 13);
                panel_1_1_4.add(lblNewLabel_15_1_4);
                
                JButton btnNewButton_4_2_4 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_4.setBackground(Color.RED);
                btnNewButton_4_2_4.setBounds(10, 230, 139, 21);
                panel_1_1_4.add(btnNewButton_4_2_4);
                
                JComboBox comboBox_1_2 = new JComboBox();
                comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_2.setBounds(160, 230, 43, 21);
                panel_1_1_4.add(comboBox_1_2);
                
                JPanel panel_1_1_5 = new JPanel();
                panel_1_1_5.setLayout(null);
                panel_1_1_5.setBackground(Color.WHITE);
                panel_1_1_5.setBounds(488, 761, 211, 261);
                panel.add(panel_1_1_5);
                
                JLabel lblNewLabel_11_1_5 = new JLabel("");
                lblNewLabel_11_1_5.setBounds(94, 5, 45, 13);
                panel_1_1_5.add(lblNewLabel_11_1_5);
                
                JLabel lblNewLabel_10_1_5 = new JLabel("");
                lblNewLabel_10_1_5.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\adidas-copa-pure-22-fg_ss5_p-200772799+u-asokjti0pfhccvk5doyi+v-z7rhtmtgsqixyzr0jkux (1).png"));
                lblNewLabel_10_1_5.setBounds(10, 5, 193, 169);
                panel_1_1_5.add(lblNewLabel_10_1_5);
                
                JLabel lblNewLabel_12_1_5 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_5.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_5.setBounds(56, 172, 127, 22);
                panel_1_1_5.add(lblNewLabel_12_1_5);
                
                JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("S");
                chckbxNewCheckBox_3_5.setBounds(14, 189, 36, 21);
                panel_1_1_5.add(chckbxNewCheckBox_3_5);
                
                JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_5.setBounds(113, 189, 36, 21);
                panel_1_1_5.add(chckbxNewCheckBox_1_1_5);
                
                JCheckBox chckbxNewCheckBox_2_2_5 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_5.setBounds(158, 189, 45, 21);
                panel_1_1_5.add(chckbxNewCheckBox_2_2_5);
                
                JCheckBox chckbxNewCheckBox_2_1_1_5 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_5.setBounds(66, 189, 36, 21);
                panel_1_1_5.add(chckbxNewCheckBox_2_1_1_5);
                
                ButtonGroup group6 = new ButtonGroup();
                group6.add(chckbxNewCheckBox_3_5);
                group6.add(chckbxNewCheckBox_1_1_5);
                group6.add(chckbxNewCheckBox_2_2_5);
                group6.add(chckbxNewCheckBox_2_1_1_5);
                
                JLabel lblNewLabel_15_1_5 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_5.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_5.setBounds(56, 216, 107, 13);
                panel_1_1_5.add(lblNewLabel_15_1_5);
                
                JButton btnNewButton_4_2_5 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_5.setBackground(Color.RED);
                btnNewButton_4_2_5.setBounds(10, 230, 139, 21);
                panel_1_1_5.add(btnNewButton_4_2_5);
                
                JComboBox comboBox_1_3 = new JComboBox();
                comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_3.setBounds(160, 230, 43, 21);
                panel_1_1_5.add(comboBox_1_3);
                
                JPanel panel_1_1_6 = new JPanel();
                panel_1_1_6.setLayout(null);
                panel_1_1_6.setBackground(Color.WHITE);
                panel_1_1_6.setBounds(721, 761, 211, 261);
                panel.add(panel_1_1_6);
                
                JLabel lblNewLabel_11_1_6 = new JLabel("");
                lblNewLabel_11_1_6.setBounds(94, 5, 45, 13);
                panel_1_1_6.add(lblNewLabel_11_1_6);
                
                JLabel lblNewLabel_10_1_6 = new JLabel("");
                lblNewLabel_10_1_6.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\adidas-x-crazyfast-pro-fg_ss5_p-200893978+u-x6r4djrx978bvhue3zqx+v-kptcgv6ikthylsykvv50 (1).png"));
                lblNewLabel_10_1_6.setBounds(10, 5, 193, 169);
                panel_1_1_6.add(lblNewLabel_10_1_6);
                
                JLabel lblNewLabel_12_1_6 = new JLabel("Bóng Adidas");
                lblNewLabel_12_1_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_12_1_6.setBounds(56, 172, 127, 22);
                panel_1_1_6.add(lblNewLabel_12_1_6);
                
                JCheckBox chckbxNewCheckBox_3_6 = new JCheckBox("S");
                chckbxNewCheckBox_3_6.setBounds(14, 189, 36, 21);
                panel_1_1_6.add(chckbxNewCheckBox_3_6);
                
                JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("L");
                chckbxNewCheckBox_1_1_6.setBounds(113, 189, 36, 21);
                panel_1_1_6.add(chckbxNewCheckBox_1_1_6);
                
                JCheckBox chckbxNewCheckBox_2_2_6 = new JCheckBox("XL");
                chckbxNewCheckBox_2_2_6.setBounds(158, 189, 45, 21);
                panel_1_1_6.add(chckbxNewCheckBox_2_2_6);
                
                JCheckBox chckbxNewCheckBox_2_1_1_6 = new JCheckBox("M");
                chckbxNewCheckBox_2_1_1_6.setBounds(66, 189, 36, 21);
                panel_1_1_6.add(chckbxNewCheckBox_2_1_1_6);
                
                ButtonGroup group7 = new ButtonGroup();
                group7.add(chckbxNewCheckBox_3_6);
                group7.add(chckbxNewCheckBox_1_1_6);
                group7.add(chckbxNewCheckBox_2_2_6);
                group7.add(chckbxNewCheckBox_2_1_1_6);
                
                JLabel lblNewLabel_15_1_6 = new JLabel("1.999.999đ");
                lblNewLabel_15_1_6.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_15_1_6.setBounds(56, 216, 107, 13);
                panel_1_1_6.add(lblNewLabel_15_1_6);
                
                JButton btnNewButton_4_2_6 = new JButton("THÊM GIỎ HÀNG");
                btnNewButton_4_2_6.setBackground(Color.RED);
                btnNewButton_4_2_6.setBounds(10, 230, 139, 21);
                panel_1_1_6.add(btnNewButton_4_2_6);
                
                JComboBox comboBox_1_4 = new JComboBox();
                comboBox_1_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
                comboBox_1_4.setBounds(160, 230, 43, 21);
                panel_1_1_6.add(comboBox_1_4);
                
                JPanel panel_6 = new JPanel();
                panel_6.setBackground(new Color(255, 0, 0));
                panel_6.setBounds(77, 702, 182, 49);
                panel.add(panel_6);
                panel_6.setLayout(null);
                
                JLabel lblNewLabel_16 = new JLabel("Giày Bóng Đá");
                lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
                lblNewLabel_16.setForeground(new Color(255, 255, 255));
                lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_16.setBounds(0, 5, 182, 44);
                panel_6.add(lblNewLabel_16);
    }
}