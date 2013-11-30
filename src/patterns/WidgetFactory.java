package patterns;

public class WidgetFactory {
	public Widget createWidget(String widgetName) {
		Widget widget = new Widget();
		widget.setName(widgetName);
		return widget;
	}
}
