package nextapp.echo.webcontainer.sync.component;

/**
 * A <code>Positionable</code> is one that can be postioned anywhere on the screen, regardless of the flow layout of other components.
 * <p>
 * By default the it acts like a normal component, and will be rendered with the flow of its parent and siblings. The component has its Positioning property set to POSITIONING_FLOW.
 * <p>
 * <h3>POSITIONING</h3>
 * 
 * However if the Positioning property is POSITIONING_ABSOLUTE or POSITIONING_RELATIVE then the component will break out of the normal flow layout and position themselves directly on the screen.
 * <p>
 * If the Positioning is POSITIONING_ABSOLUTE, then the component is positioned at an absolute point from the origin of the client window. The left, top, right and bottom properties can be used to
 * position the component.
 * <p>
 * If the Positioning is POSITIONING_RELATIVE, then the component is positioned at an at a point on the screen relative to its first positioned parent component. If it has no parents that are
 * positioned, then it will be positioned relative to the origins of the client window.
 * <p>
 * <h3>left, top, right, bottom</h3>
 * 
 * If an actual positioning properties, left, top, right, bottom, are set to either Integer.MAX_VALUE or Integer.MIN_VALUE, then it will not be taken into affect when positioning the component.
 * <p>
 * For example you could position a component to 100 pixels in from the bottom and 10 pixels if from the right by only settting the bottom and right properties to 100 and 10 respectively. The width of
 * the component will be determined by the content.
 * <p>
 * By default all positioning properties are set to Integer.MAX_VALUE. A convenience method called <i>clearPositioning()</i> is propvided to clear all positioning and have the component acts like a
 * normal flow component.
 * <p>
 * <h3>Z-INDEX</h3>
 * 
 * A <code>Positionable</code> also supports a z-idex, which controls how it is layered over other components, especially other <code>Positionable</code>.
 * <p>
 */
public interface Positionable {

	/**
	 * This can be used to indicate that an integer parameter is not define (ie should not be interpreseted).
	 */
	public static final int UNDEFINED = Integer.MAX_VALUE;

	/**
	 * These constants are used to indicate that positioning rules in place.
	 */
	public static enum POSITIONING { FLOW, ABSOLUTE, RELATIVE, FIXED}

	/**
	 * A style constant for the Bottom property. Values of this key must be of type <code>int</code>
	 */
	public static final String STYLE_BOTTOM = "bottom";

	/**
	 * A style constant for the Left property. Values of this key must be of type <code>int</code>
	 */
	public static final String STYLE_LEFT = "left";

	/**
	 * A style constant for the Positioning property. Values of this key must be of type <code>int</code>
	 */
	public static final String STYLE_POSITIONING = "positioning";

	/**
	 * A style constant for the Right property. Values of this key must be of type <code>int</code>
	 */
	public static final String STYLE_RIGHT = "right";

	/**
	 * A style constant for the Top property. Values of this key must be of type <code>int</code>
	 */
	public static final String STYLE_TOP = "top";

	/**
	 * This property name is fired when any of the positioning elements change (ie. top, left, bottom, left, zindex, positioning)
	 */
	public static final String POSITION_CHANGED_PROPERTY = "position";

	/**
	 * This should sets all the positioning attributes (left,top,right,bottom,z-index) to Integer.MAX.
	 */
	public void clearPositioning();

	/**
	 * Returns the bottom Y position of the component
	 */
	public Integer getBottom();

	/**
	 * Returns the left X position of the component
	 */
	public Integer getLeft();

	/**
	 * This can be one of :
	 * <ul>
	 * <li>POSITIONING.NONE</li>
	 * <li>POSITIONING.ABSOLUTE</li>
	 * <li>POSITIONING.RELATIVE</li>
	 * </ul>
	 */
	public POSITIONING getPositioning();

	/**
	 * Returns the right X position of the component
	 */
	public Integer getRight();

	/**
	 * Returns the top Y position of the component
	 */
	public Integer getTop();

	/**
	 * Sets the bottom Y position of the component
	 */
	public void setBottom(Integer newValue);

	/**
	 * Set the left X position of the component
	 */
	public void setLeft(Integer newValue);

	/**
	 * Sets the positioning of the component
	 * 
	 * This can be one of :
	 * <ul>
	 * <li>POSITIONING_NONE</li>
	 * <li>POSITIONING_ABSOLUTE</li>
	 * <li>POSITIONING_RELATIVE</li>
	 * </ul>
	 */
	public void setPositioning(POSITIONING newPositioning);

	/**
	 * Sets the right X position of the component
	 */
	public void setRight(Integer newValue);

	/**
	 * Sets the top Y position of the component
	 */
	public void setTop(Integer newValue);

}
