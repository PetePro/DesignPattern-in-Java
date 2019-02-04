package behavioral.visitor;

/*
 * ObjectStructure
 * ö��Element����
 */

import java.util.ArrayList;
import java.util.List;

public class Computer {

	private List<ComputerElement> elements = new ArrayList<ComputerElement>();

	public void attach(ComputerElement element) {
		elements.add(element);
	}

	public void detach(ComputerElement element) {
		elements.remove(element);
	}

	public void display(ComputerVisitor visitor) {
		for (ComputerElement element : elements) {
			element.accept(visitor);
		}
	}

}
