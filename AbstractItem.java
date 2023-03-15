//**************************************************************************
// AbstractItem.java         Author:Ali Berk Karaarslan     Date:06.03.2023
//
// One of the classes of Xiangqi Project.
//
//**************************************************************************

public abstract class AbstractItem implements ItemInterface{

	private String position;  // tahtadaki konumu gösterir. Örneğin, a1

	public String getPosition(){
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
