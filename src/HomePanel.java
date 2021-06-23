import javax.swing.*;

public class HomePanel {
	
	private ImageIcon image;
	private JLabel banner;
	private JPanel homePanel;
	
	HomePanel() {
		try{
			image = new ImageIcon("resource\\image\\banner1.jpg");
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		banner = new JLabel();
		banner.setIcon(image);
		
		homePanel = new JPanel();
		homePanel.add(banner);
		
	}

	public JPanel getHomePanel() {
		return homePanel;
	}
	
}
