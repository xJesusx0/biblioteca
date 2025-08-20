package co.edu.iub;

import co.edu.iub.views.ListarMaterialView;
import co.edu.iub.views.ViewsHolder;

public class Main {
	public static void main(String[] args) {
		ListarMaterialView librosView = ViewsHolder.listarMaterialView;
		librosView.setVisible(true);
		librosView.setLocationRelativeTo(null);
	}
}