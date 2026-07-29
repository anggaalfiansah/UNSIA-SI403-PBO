package latihan13;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PemesananMinuman extends JFrame {

    private JLabel lblJudul;

    // Minuman
    private JRadioButton rbKopi;
    private JRadioButton rbTeh;
    private JRadioButton rbJus;
    private ButtonGroup bgMinuman;

    // Ukuran
    private JComboBox<String> cbUkuran;

    // Tingkat gula
    private JRadioButton rbTanpaGula;
    private JRadioButton rbSedikitGula;
    private JRadioButton rbGulaNormal;
    private ButtonGroup bgGula;

    // Topping
    private JComboBox<String> cbTopping;

    // Tombol
    private JButton btnProses;
    private JButton btnReset;

    public PemesananMinuman() {
        setTitle("Form Pemesanan Minuman");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 450);
        setLocationRelativeTo(null);

        // Main panel with padding
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(20, 25, 20, 25));
        mainPanel.setBackground(new Color(245, 245, 255));

        // Judul
        lblJudul = new JLabel("Form Pemesanan Minuman", SwingConstants.CENTER);
        lblJudul.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblJudul.setForeground(new Color(40, 40, 120));
        lblJudul.setBorder(new EmptyBorder(0, 0, 20, 0));
        mainPanel.add(lblJudul, BorderLayout.NORTH);

        // Panel form
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(245, 245, 255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        Font labelFont = new Font("Segoe UI", Font.BOLD, 14);
        Font controlFont = new Font("Segoe UI", Font.PLAIN, 14);

        // Jenis minuman
        JLabel lblMinuman = new JLabel("Jenis Minuman:");
        lblMinuman.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        formPanel.add(lblMinuman, gbc);

        rbKopi = new JRadioButton("Kopi");
        rbTeh = new JRadioButton("Teh");
        rbJus = new JRadioButton("Jus");
        bgMinuman = new ButtonGroup();
        bgMinuman.add(rbKopi);
        bgMinuman.add(rbTeh);
        bgMinuman.add(rbJus);

        JPanel pnlMinuman = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        pnlMinuman.setBackground(new Color(245, 245, 255));
        rbKopi.setFont(controlFont);
        rbKopi.setBackground(new Color(245, 245, 255));
        rbTeh.setFont(controlFont);
        rbTeh.setBackground(new Color(245, 245, 255));
        rbJus.setFont(controlFont);
        rbJus.setBackground(new Color(245, 245, 255));
        pnlMinuman.add(rbKopi);
        pnlMinuman.add(rbTeh);
        pnlMinuman.add(rbJus);

        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(pnlMinuman, gbc);

        // Ukuran
        JLabel lblUkuran = new JLabel("Ukuran Gelas:");
        lblUkuran.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        formPanel.add(lblUkuran, gbc);

        cbUkuran = new JComboBox<>(new String[] { "Small", "Medium", "Large" });
        cbUkuran.setFont(controlFont);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(cbUkuran, gbc);

        // Tingkat gula
        JLabel lblGula = new JLabel("Tingkat Gula:");
        lblGula.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.3;
        formPanel.add(lblGula, gbc);

        rbTanpaGula = new JRadioButton("Tanpa Gula");
        rbSedikitGula = new JRadioButton("Sedikit Gula");
        rbGulaNormal = new JRadioButton("Gula Normal");
        bgGula = new ButtonGroup();
        bgGula.add(rbTanpaGula);
        bgGula.add(rbSedikitGula);
        bgGula.add(rbGulaNormal);

        JPanel pnlGula = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        pnlGula.setBackground(new Color(245, 245, 255));
        rbTanpaGula.setFont(controlFont);
        rbTanpaGula.setBackground(new Color(245, 245, 255));
        rbSedikitGula.setFont(controlFont);
        rbSedikitGula.setBackground(new Color(245, 245, 255));
        rbGulaNormal.setFont(controlFont);
        rbGulaNormal.setBackground(new Color(245, 245, 255));
        pnlGula.add(rbTanpaGula);
        pnlGula.add(rbSedikitGula);
        pnlGula.add(rbGulaNormal);

        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(pnlGula, gbc);

        // Topping
        JLabel lblTopping = new JLabel("Topping:");
        lblTopping.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.3;
        formPanel.add(lblTopping, gbc);

        cbTopping = new JComboBox<>(new String[] { "Tanpa topping", "Bubble", "Jelly", "Cream", "Keju" });
        cbTopping.setFont(controlFont);
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        formPanel.add(cbTopping, gbc);

        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Tombol
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(new Color(245, 245, 255));
        buttonPanel.setBorder(new EmptyBorder(15, 0, 0, 0));

        btnProses = new JButton("Proses");
        btnProses.setFont(labelFont);
        btnProses.setFocusPainted(false);

        btnReset = new JButton("Reset");
        btnReset.setFont(labelFont);
        btnReset.setFocusPainted(false);

        buttonPanel.add(btnProses);
        buttonPanel.add(btnReset);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners
        btnProses.addActionListener(e -> prosesPesanan());
        btnReset.addActionListener(e -> resetForm());

        add(mainPanel);
    }

    private String getMinuman() {
        if (rbKopi.isSelected())
            return "Kopi";
        if (rbTeh.isSelected())
            return "Teh";
        if (rbJus.isSelected())
            return "Jus";
        return null;
    }

    private String getGula() {
        if (rbTanpaGula.isSelected())
            return "Tanpa Gula";
        if (rbSedikitGula.isSelected())
            return "Sedikit Gula";
        if (rbGulaNormal.isSelected())
            return "Gula Normal";
        return null;
    }

    private void prosesPesanan() {
        String minuman = getMinuman();
        String ukuran = (String) cbUkuran.getSelectedItem();
        String gula = getGula();
        String topping = (String) cbTopping.getSelectedItem();

        if (minuman == null) {
            JOptionPane.showMessageDialog(this,
                    "Silakan pilih jenis minuman!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (gula == null) {
            JOptionPane.showMessageDialog(this,
                    "Silakan pilih tingkat gula!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String pesan = "Pesanan Anda:\n"
                + "Minuman : " + minuman + "\n"
                + "Ukuran  : " + ukuran + "\n"
                + "Gula    : " + gula + "\n"
                + "Topping : " + topping;

        JOptionPane.showMessageDialog(this, pesan,
                "Hasil Pemesanan",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void resetForm() {
        bgMinuman.clearSelection();
        bgGula.clearSelection();
        cbUkuran.setSelectedIndex(0);
        cbTopping.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new PemesananMinuman().setVisible(true);
        });
    }
}