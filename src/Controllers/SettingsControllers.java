package Controllers;


import View.SystemView;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SettingsControllers implements MouseListener {

    private SystemView views;

    public SettingsControllers(SystemView views) {
        this.views = views;
        
        this.views.jLabelProducts.addMouseListener(this);
        this.views.jLabelPurchase.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.jLabelEmployers.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()== views.jLabelProducts) {
            views.jPanelProducts.setBackground(new Color(152,202,63));
        }else if(e.getSource() == views.jLabelPurchase){
            views.jPanelPurchase.setBackground(new Color(152,202,63)); 
        }else if(e.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(152,202,63)); }
        else if(e.getSource() == views.jLabelEmployers){
            views.jPanelEmployers.setBackground(new Color(152,202,63)); }
        else if(e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(152,202,63)); }
        else if(e.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(152,202,63)); }
        else if(e.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(152,202,63)); }
        else if(e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(152,202,63)); }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         if(e.getSource()== views.jLabelProducts) {
            views.jPanelProducts.setBackground(new Color(18,45,61));
        }else if(e.getSource() == views.jLabelPurchase){
            views.jPanelPurchase.setBackground(new Color(18,45,61)); 
        }else if(e.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(18,45,61)); }
        else if(e.getSource() == views.jLabelEmployers){
            views.jPanelEmployers.setBackground(new Color(18,45,61)); }
        else if(e.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(18,45,61)); }
        else if(e.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(18,45,61)); }
        else if(e.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(18,45,61)); }
        else if(e.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(18,45,61)); }
    }
    }


