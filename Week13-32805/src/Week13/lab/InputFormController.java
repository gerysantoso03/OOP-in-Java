package Week13.lab;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class InputFormController {
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtProductName;
	
	@FXML
	private TextField txtPrice;
	
	@FXML
	private TextField txtStock;
	
	@FXML
	private ComboBox<String> cboCategory;
	
	private ObservableList<Item> items;
	
	@FXML
	public void handleBtnAdd() {
		int id = Integer.parseInt(txtId.getText());
		String productName = txtProductName.getText();
		int price = Integer.parseInt(txtPrice.getText());
		String category = cboCategory.getValue().toString();
		int stock = Integer.parseInt(txtStock.getText());
		items.add(new Item(id, productName, price, category, stock));
	}
	
	public void setListItem(ObservableList<Item> items) {
		this.items = items;
	}
	
}
