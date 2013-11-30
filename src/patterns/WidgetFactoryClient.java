package patterns;

public class WidgetFactoryClient {
	public void foo() {
		WidgetFactory widgetFactory = new WidgetFactory();
		String widgetName = "";
		Widget widget = widgetFactory.createWidget(widgetName); 
	}
}
