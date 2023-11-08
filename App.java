import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Java Multitool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(3, 1));

        JButton calc = new JButton("Calculatrice");
        JButton explFichiers = new JButton("Explorateur de fichiers");
        JButton notepad = new JButton("Bloc-notes");
        JButton word = new JButton("Word");
        JButton excel = new JButton("Excel");
        JButton powerpoint = new JButton("PowerPoint");
        JButton vsc = new JButton("Visual Studio Code");
        JButton chrome = new JButton("Google Chrome");
        JButton terminal = new JButton("Windows Terminal");
        JButton empty = new JButton("");
        JButton empty2 = new JButton("");


        JButton about = new JButton("A propos de Java Multitool");

        panel.add(calc);
        panel.add(explFichiers);
        panel.add(notepad);
        panel.add(word);
        panel.add(excel);
        panel.add(powerpoint);
        panel.add(vsc);
        panel.add(chrome);
        panel.add(terminal);
        panel.add(empty);
        panel.add(empty2);

        panel.add(about);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("calc");
            }
        });

        explFichiers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("explorer");
            }
        });

        notepad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("notepad");
            }
        });

        word.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
            }
        });

        excel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
            }
        });

        powerpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE");
            }
        });

        vsc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("C:\\Program Files\\Microsoft VS Code\\Code");
            }
        });

        chrome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            }
        });

        terminal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openProgram("C:\\Users\\YOUR_USERNAME\\AppData\\Local\\Microsoft\\WindowsApps\\wt.exe");
            }   
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Java Multitool v1.0");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    private static void openProgram(String programName) {
        try {
            Process process = Runtime.getRuntime().exec(programName);
            process.waitFor();        
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'exécution du programme : " + ex.getMessage(), "Erreur",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}