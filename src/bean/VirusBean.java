package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Virus;


@ManagedBean(name="virusBean")
@SessionScoped
public class VirusBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Virus> items;
	private String imageUri;
	
	public VirusBean() {
		this.reset();
	}
	
	public void reset() {
		this.name = "Institut Pasteur";
		this.items = new ArrayList<>();
		items.add(new Virus("Ebola"));
		items.add(new Virus("RSV"));
		items.add(new Virus("Rage"));
		this.imageUri = "resources/img/pasteur.png";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Virus> getItems() {
		return items;
	}

	public void setItems(List<Virus> items) {
		this.items = items;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
}
