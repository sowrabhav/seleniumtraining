package org.codetemplates;

import java.util.List;




//*
// class description: ClassTemplate
// ClassTemplate is a template class
// Class is a blueprint for objects
// Class is a template for objects
// Class is a user-defined data type
// Class is a collection of fields (variables) and methods (actions)
// Class is a logical entity
// */
public class ClassTemplate {
    Button googleSearchButton = new Button();
//    Button regularButton = new Button(10, 20);

    // A --> B instantiate --> B static, B instance, B constructor
    // A --> B Static --> C instantiate --> C static, C instance, C constructor
    // A --> B Instance
    // A --> B Constructor
    // A --> A Constructor

    /**
     * ThisClass Constructor <--
     *  SuperClass Static block <-- SuperClass Instance block <-- SuperClass Constructor block <--
     *  anySubClass Static block <-- anySubClass Instance block <-- anySubClass Constructor block
*/
    ClassTemplate(){
        System.out.println("Constructor code block");
    }

    public static void main(String[] args) {
        ClassTemplate classTemplate = new ClassTemplate();
        classTemplate.getGoogleSearchButton().setButtonText("Google Search");
        classTemplate.getGoogleSearchButton().setButtonColor("Blue");
        classTemplate.getGoogleSearchButton().setButtonTextColor("White");
        classTemplate.getGoogleSearchButton().setButtonWidth(100);
        classTemplate.getGoogleSearchButton().setButtonHeight(50);
        classTemplate.getGoogleSearchButton().setButtonEnabled(true);
    }

    // getters and setters for googleSearchButton
    public Button getGoogleSearchButton() {
        return googleSearchButton;
    }

    public void setGoogleSearchButton(Button googleSearchButton) {
        this.googleSearchButton = googleSearchButton;
    }

}

class Button{
    private String buttonText;
    private String buttonTextColor;
    private int buttonWidth;
    private int buttonHeight;
    private String buttonColor;
    private boolean buttonEnabled;

    static{
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    // constructor for regular Button
    public Button(int buttonWidth, int buttonHeight){
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;
        System.out.println("Button created with width: " + buttonWidth + " and height: " + buttonHeight);
    }

    public Button() {
        System.out.println("Constructor block");
    }

    public void clickButton(){
        System.out.println("Button clicked");
    }
    //Mouse over
    public void mouseOverButton(){
        System.out.println("Mouse over button");
    }
    // double click
    public void doubleClickButton(){
        System.out.println("Double click button");
    }
    // right click
    public void rightClickButton(){
        System.out.println("Right click button");
    }
    // drag and drop
    public void dragAndDropButton(){
        System.out.println("Drag and drop button");
    }

    // getters and setters
    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getButtonTextColor() {
        return buttonTextColor;
    }

    public void setButtonTextColor(String buttonTextColor) {
        this.buttonTextColor = buttonTextColor;
    }

    public int getButtonWidth() {
        return buttonWidth;
    }

    public void setButtonWidth(int buttonWidth) {
        this.buttonWidth = buttonWidth;
    }

    public int getButtonHeight() {
        return buttonHeight;
    }

    public void setButtonHeight(int buttonHeight) {
        this.buttonHeight = buttonHeight;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public boolean isButtonEnabled() {
        return buttonEnabled;
    }

    public void setButtonEnabled(boolean buttonEnabled) {
        this.buttonEnabled = buttonEnabled;
    }


}
