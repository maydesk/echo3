package nextapp.echo.webcontainer.sync.property;

import nextapp.echo.app.xml.XmlContext;
import nextapp.echo.webcontainer.OutputContext;
import nextapp.echo.webcontainer.PropertySynchronizePeer;

import org.w3c.dom.Element;

public class IntegerPeer 
implements PropertySynchronizePeer {

    /**
     * @see nextapp.echo.webcontainer.PropertySynchronizePeer#toProperty(XmlContext, Class, org.w3c.dom.Element)
     */
    public Object toProperty(XmlContext context, Class objectClass, Element propertyElement) {
        String valueText = propertyElement.getAttribute("v"); 
        return valueText == null ? null : new Integer(valueText);
    }

    /**
     * @see nextapp.echo.webcontainer.PropertySynchronizePeer#toXml(OutputContext, Class, org.w3c.dom.Element, java.lang.Object)
     */
    public void toXml(OutputContext rc, Class objectClass, Element propertyElement, Object propertyValue) {
        propertyElement.setAttribute("t", "i");
        propertyElement.setAttribute("v", propertyValue.toString());
    }
}
