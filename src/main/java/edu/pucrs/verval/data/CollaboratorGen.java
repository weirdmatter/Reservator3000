package edu.pucrs.verval.data;

import java.util.ArrayList;
import java.util.List;

import edu.pucrs.verval.entities.Collaborator;

public class CollaboratorGen {
	
	private List<Collaborator> collaborators;
	
	public static CollaboratorGen instance = new CollaboratorGen();

	public CollaboratorGen() {
		this.collaborators = new ArrayList<>();
		this.collaborators.add(new Collaborator(1,  "12345",  "Chiara Paskulin",     "chiara.paskulin@mail.com"));
		this.collaborators.add(new Collaborator(2,  "56931",  "Guilherme Munaretto", "guilherme.muna@mail.com"));
		this.collaborators.add(new Collaborator(3,  "93750",  "Henrique Kops",       "henrique.kops@mail.com"));
		this.collaborators.add(new Collaborator(4,  "48513",  "Rodrigo Mello",       "rodrigo.mello@mail.com"));
		this.collaborators.add(new Collaborator(5,  "82941",  "Larissa Salerno",     "lari.salerno@mail.com"));
		this.collaborators.add(new Collaborator(6,  "93859",  "João Nascimento",     "joao.nascimento@mail.com"));
		this.collaborators.add(new Collaborator(7,  "11404",  "Tiago Ferracini",     "tiago.ferracini@mail.com"));
		this.collaborators.add(new Collaborator(8,  "39512",  "Alexandre Agusteto",  "alexandre.agusteto@mail.com"));
		this.collaborators.add(new Collaborator(9,  "22415",  "Avelino Arrozo",      "avelino.arrozo@mail.com"));
		this.collaborators.add(new Collaborator(10, "91852",  "Eduardo Zoruda",      "eduardo.zoruda@mail.com"));
	}
	
	public List<Collaborator> getCollaborators() {
		return this.collaborators;
	}
	
	public static CollaboratorGen getInstance() {
		return instance;
	}
}
