package edu.ncsu.monopoly;

public class CardCell extends Cell {
    private int type;
    private String name;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public boolean playAction(String msg) {
    	return true;
    }
    
    public int getType() {
        return type;
    }

	@Override
	public Player getTheOwner() {
		return theOwner;
	}

	@Override
	public String getName() {
		return name;
	}
}
