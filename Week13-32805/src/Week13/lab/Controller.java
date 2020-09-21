package Week13.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private TableView<Item> tableItem;
	
	@FXML
	private TableColumn<Item, String> colId;
	
	@FXML
	private TableColumn<Item, String> colProductName; 
	
	@FXML
	private TableColumn<Item, String> colPrice;
	
	@FXML
	private TableColumn<Item, String> colCategory;
	
	@FXML
	private TableColumn<Item, String> colStock;
	
	@FXML
	private TextField searchKey;
	
	private ObservableList<Item> items = FXCollections.observableArrayList(
		new Item(1, "Minyak Goreng Bimoli 1.5L", 25800, "Sembako", 100),
		new Item(2, "Beras Ramos 5kg", 66500, "Sembako", 50),
		new Item(3, "Kratingdaeng", 5300, "Minuman", 200),
		new Item(4, "Sarden ABC Ukuran Besar", 22300, "Makanan Kaleng", 40),
		new Item(5, "Miatos Rasa Jagung Bakar 120g", 9800, "Makanan Ringan", 200),
		new Item(6, "Indomie Goreng Rasa Ayam", 2200, "Sembako", 2000),
		new Item(7, "Ultramilk UHT 1L", 13200, "Minuman", 50),
		new Item(8, "Roti Tawar 12 Potong", 12300, "Bakery", 10),
		new Item(9, "Roti Tawar 24 Potong", 22000, "Bakery", 15)
	);
	
	ObservableList<Item> observeFilteredItems = FXCollections.observableArrayList();
	
	public void initialize() {
		colId.setCellValueFactory(new PropertyValueFactory<Item, String>("id"));
		colProductName.setCellValueFactory(new PropertyValueFactory<Item, String>("productName"));
		colPrice.setCellValueFactory(new PropertyValueFactory<Item, String>("price"));
		colCategory.setCellValueFactory(new PropertyValueFactory<Item, String>("category"));
		colStock.setCellValueFactory(new PropertyValueFactory<Item, String>("stock"));
		tableItem.setItems(items);
	}
	
	@FXML
	public void handleBtnEntry() {
		try {
			FXMLLoader loader = new FXMLLoader(Controller.class.getResource("/Week13/lab/entryForm.fxml"));
			Parent entryForm = loader.load();
			Stage entryStage = new Stage();
			entryStage.setTitle("New Item");
			entryStage.setScene(new Scene(entryForm));
			entryStage.show();
			entryStage.requestFocus();
			
			// Inject the controller so we can use its functions here.
			InputFormController inputController = loader.getController();
			inputController.setListItem(items);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handleBtnDelete() {
		Item selectedItem = tableItem.getSelectionModel().getSelectedItem();
		items.remove(selectedItem);
		
		// Ensure to remove it from the filtered list too.
		handleBtnSearch();
		observeFilteredItems.remove(selectedItem);
	}
	
	@FXML
	public void handleBtnSearch() {
		String comparator = searchKey.getText().toLowerCase();	
		List<Item> filteredItems = new ArrayList<Item>();
		
		if(comparator == "" || comparator.isEmpty() || comparator.isBlank()) {
			tableItem.setItems(items);
			return;
		}
		
		filteredItems = items.stream()
				.filter(lambda -> lambda.getProductName().toLowerCase().contains(comparator))
				.collect(Collectors.toList());
		ObservableList<Item> observeFilteredItems = FXCollections.observableArrayList(filteredItems);
		
		/*
		ObservableList<Item> filteredItems = FXCollections.observableArrayList();
		for(Item i : items) {
			if(i.getProductName().toLowerCase().contains(comparator)) {
				filteredItems.add(i);
			}
		}
		*/
		
		tableItem.setItems(observeFilteredItems);
		
	}

}
