package edu.pucrs.verval.data;

import java.util.ArrayList;
import java.util.List;

import edu.pucrs.verval.entities.Resource;

public class ResourceGen {
	
	private List<Resource> resources;
	public static final ResourceGen instance = new ResourceGen();
	
	public ResourceGen() {
		this.resources = new ArrayList<>();
				
		//Generate physical spaces (rooms)
		this.resources.add(new Resource(1, "Room 506", "R649-506", 1, 30.0, "Room", 40.0, 40));
		this.resources.add(new Resource(2, "Room 301", "R649-301", 1, 25.0, "Room", 36.0, 20));
		this.resources.add(new Resource(3, "Room 408", "R649-408", 1, 20.0, "Room", 28.0, 10));
		this.resources.add(new Resource(4, "Room 700", "R649-700", 1, 28.0, "Room", 16.0, 10));
		this.resources.add(new Resource(5, "Room 603", "R649-603", 1, 17.0, "Room", 32.0, 20));
		this.resources.add(new Resource(6, "Room 202", "R649-202", 1, 10.0, "Room", 18.0, 10));
		
		//Generate physical spaces (auditoriums)
		this.resources.add(new Resource(7,  "Auditorium I",   "A441-506", 1, 45.0, "Auditorium", 80.0, 60));
		this.resources.add(new Resource(8,  "Auditorium II",  "A441-203", 1, 39.0, "Auditorium", 75.0, 40));
		this.resources.add(new Resource(9,  "Auditorium III", "A441-882", 1, 39.0, "Auditorium", 49.0, 50));
		this.resources.add(new Resource(10, "Auditorium IV",  "A441-405", 1, 28.0, "Auditorium", 50.0, 60));
		this.resources.add(new Resource(11, "Auditorium V",   "A441-240", 1, 40.0, "Auditorium", 60.0, 80));

		
		//Generate mobile resources (notebooks, smartphones, tablets)
		this.resources.add(new Resource(12, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(13, "Tablet Acer Octa-Core",  "M539-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(14, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(15, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(16, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(17, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(18, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		this.resources.add(new Resource(19, "Smartphone Samsung 8GB", "M520-41P", 5, 300.0, "Mobile", 0.0, 0));
		
		//Generate furniture resources (tables, chairs, desks)
		this.resources.add(new Resource(20, "Wooden Chair Kit x4",                        "F281-41P", 5, 300.0, "Furniture", 0.0, 0));
		this.resources.add(new Resource(21, "Wooden Table with Golden Details",           "M520-41P", 5, 300.0, "Furniture", 0.0, 0));
		this.resources.add(new Resource(22, "Steel Chair Kit x4",                         "M520-41P", 5, 300.0, "Furniture", 0.0, 0));
		this.resources.add(new Resource(23, "Steel Table",                                "M520-41P", 5, 300.0, "Furniture", 0.0, 0));
		this.resources.add(new Resource(24, "Glass Table With Platinum Decoration",       "M520-41P", 5, 300.0, "Furniture", 0.0, 0));
		this.resources.add(new Resource(25, "Gigantic Lamp With Purple Details",          "M520-41P", 5, 300.0, "Furniture", 0.0, 0));
	}

	public static ResourceGen getInstance() {
		return instance;
	}
	
	public List<Resource> getResources() {
		return this.resources;
	}
}
