/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@XmlRootElement
public class Result {
    
    private double Circle;
    private double area;
    
    public double getareaCircle() {
        return area;
    }
    @XmlElement
    public void setareaCircle(double area) {
        this.area = area;
    }

    public double getCircle() {
        return Circle;
    }
    @XmlElement
    public void setCircle(double Circle) {
        this.Circle = Circle;
    }

}
