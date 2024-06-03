package QuanLi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
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
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import javax.swing.border.LineBorder;

public class QuanLiDoanhThu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
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
                    QuanLiDoanhThu frame = new QuanLiDoanhThu();
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
    public QuanLiDoanhThu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1071, 659);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 993, 725);

        // Add the panel to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setBounds(0, 0, 1023, 1023); // Adjust this size as needed
        contentPane.add(scrollPane);

        // Set preferred size for panel to ensure scroll bars appear
        panel.setPreferredSize(new Dimension(993, 1500)); // Change height as needed
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 0, 234, 606);
        panel_1.setBackground(new Color(255, 0, 0));
        panel.add(panel_1);
        panel_1.setLayout(null);
        
                JButton btnNewButton_1 = new JButton("Báo Cáo Doanh Thu");
                btnNewButton_1.setBounds(0, 351, 234, 49);
                panel_1.add(btnNewButton_1);
                btnNewButton_1.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                        // Open ClientQuanAo frame
                        QuanLiDoanhThu quanLiDoanhThuFrame = new QuanLiDoanhThu();
                        quanLiDoanhThuFrame.setVisible(true);
                    }
                });
                btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                btnNewButton_1.setForeground(new Color(255, 255, 255));
                btnNewButton_1.setOpaque(true);
                btnNewButton_1.setContentAreaFilled(true);
                btnNewButton_1.setBorderPainted(false);
                btnNewButton_1.setBackground(new Color(255, 166, 0));
                
       

                JButton btnNewButton_3 = new JButton("Quản Lí Đơn Hàng");
                btnNewButton_3.setBounds(0, 292, 234, 49);
                panel_1.add(btnNewButton_3);
                btnNewButton_3.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                        // Open ClientQuanAo frame
                        QuanLiDonHang quanLiDonHangFrame = new QuanLiDonHang();
                        quanLiDonHangFrame.setVisible(true);
                    }
                });
                btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
                btnNewButton_3.setForeground(new Color(255, 255, 255));
                btnNewButton_3.setOpaque(true);
                btnNewButton_3.setContentAreaFilled(true);
                btnNewButton_3.setBorderPainted(false);
                btnNewButton_3.setBackground(new Color(202, 83, 53));
                

                JButton btnNewButton_2 = new JButton("Quản Lí Sản Phẩm");
                btnNewButton_2.setBounds(0, 231, 234, 49);
                panel_1.add(btnNewButton_2);
                btnNewButton_2.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                        // Open ClientQuanAo frame
                        QuanLiSanPham quanLiSanPhamFrame = new QuanLiSanPham();
                        quanLiSanPhamFrame.setVisible(true);
                    }
                });
                btnNewButton_2.setForeground(new Color(255, 255, 255));
                btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                btnNewButton_2.setOpaque(true);
                btnNewButton_2.setContentAreaFilled(true);
                btnNewButton_2.setBorderPainted(false);
                btnNewButton_2.setBackground(new Color(235, 138, 20));
                
                
                        JButton btnNewButton = new JButton("Quản Lí Khách Hàng");
                        btnNewButton.setBounds(0, 172, 234, 49);
                        panel_1.add(btnNewButton);
                        btnNewButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                // Open ClientQuanAo frame
                                QuanLiKhachHang quanLiKhachHangFrame = new QuanLiKhachHang();
                                quanLiKhachHangFrame.setVisible(true);
                            }
                        });
                        btnNewButton.setForeground(new Color(255, 255, 255));
                        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        btnNewButton.setBackground(new Color(248, 103, 7)); // Set background color to red
                        btnNewButton.setOpaque(true); // Ensure the button is opaque
                        btnNewButton.setBorderPainted(false); // Optional: remove border
                        btnNewButton.setContentAreaFilled(true);
                        
                        
                        Border whiteBorder = BorderFactory.createLineBorder(Color.WHITE, 10);
                        btnNewButton_1.setBorder(whiteBorder);
                        btnNewButton_2.setBorder(whiteBorder);
                        btnNewButton_3.setBorder(whiteBorder); // Đặt đường viền màu trắng và với dày 7 cho nút btnNewButton
                        btnNewButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 7));
                        
                        JLabel lblNewLabel = new JLabel("");
                        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\Header-Logo1500994616801 (1) (1).png"));
                        lblNewLabel.setBounds(53, 10, 121, 94);
                        panel_1.add(lblNewLabel);
                        
                        JLabel lblNewLabel_1 = new JLabel("Quang Huy");
                        lblNewLabel_1.setForeground(new Color(255, 255, 255));
                        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
                        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNewLabel_1.setBounds(42, 95, 132, 22);
                        panel_1.add(lblNewLabel_1);
                        
                        JLabel lblNewLabel_2 = new JLabel("Chào mừng bạn trở lại");
                        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
                        lblNewLabel_2.setForeground(new Color(255, 255, 255));
                        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNewLabel_2.setBounds(27, 114, 159, 22);
                        panel_1.add(lblNewLabel_2);
                        
                        JButton btnNewButton_1_1 = new JButton("Thoát");
                        btnNewButton_1_1.setOpaque(true);
                        btnNewButton_1_1.setForeground(Color.WHITE);
                        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                        btnNewButton_1_1.setContentAreaFilled(true);
                        btnNewButton_1_1.setBorderPainted(false);
                        btnNewButton_1_1.setBackground(new Color(197, 141, 58));
                        btnNewButton_1_1.setBounds(0, 415, 234, 49);
                        panel_1.add(btnNewButton_1_1);
                        
                        
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(243, 0, 761, 36);
        panel_2.setBackground(new Color(255, 0, 0));
        panel.add(panel_2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(192, 192, 192));
        panel_3.setBounds(243, 38, 761, 568);
        panel.add(panel_3);
        panel_3.setLayout(null);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(255, 0, 0));
        panel_4.setBounds(10, 10, 10, 38);
        panel_3.add(panel_4);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBounds(21, 10, 730, 38);
        panel_3.add(panel_5);
        panel_5.setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel("Tổng Doanh Thu");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(54, 0, 184, 38);
        panel_5.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\NITRO 5\\Downloads\\icons8-sales-performance-48.png"));
        lblNewLabel_4.setBounds(4, 0, 45, 38);
        panel_5.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(20, 58, 45, 38);
        panel_3.add(lblNewLabel_5);
        
       
                
                // Create a ButtonGroup and add the checkboxes to it
                ButtonGroup group = new ButtonGroup();
                
                ButtonGroup group1 = new ButtonGroup();
                
                ButtonGroup group2 = new ButtonGroup();
                
                ButtonGroup group3 = new ButtonGroup();
                
                ButtonGroup group4 = new ButtonGroup();
                
                ButtonGroup group5 = new ButtonGroup();
                
                ButtonGroup group6 = new ButtonGroup();
                
                ButtonGroup group7 = new ButtonGroup();
    }
}