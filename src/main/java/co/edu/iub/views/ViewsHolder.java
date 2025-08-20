package co.edu.iub.views;

import javax.swing.*;

public class ViewsHolder {

	public static final ListarMaterialView listarMaterialView = new ListarMaterialView();
	public static final PrestarODevolverMaterialView prestarODevolverMaterialView = new PrestarODevolverMaterialView();

	public static void cerrarYAbrirVista(JFrame frameToCLose, JFrame frameToOpen){
		frameToCLose.setVisible(false);
		frameToOpen.setLocationRelativeTo(null);
		frameToOpen.setVisible(true);
	}
}
