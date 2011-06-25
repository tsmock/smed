package oseam.panels;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import java.util.EnumMap;

import oseam.Messages;
import oseam.dialogs.OSeaMAction;
import oseam.seamarks.SeaMark.Shp;
import oseam.seamarks.SeaMark.Obj;

public class PanelStbd extends JPanel {

    private OSeaMAction dlg;
    private ButtonGroup regionButtons = new ButtonGroup();
    public JRadioButton regionAButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/RegionAButton.png")));
    public JRadioButton regionBButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/RegionBButton.png")));
    public JRadioButton regionCButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/RegionCButton.png")));
    private ActionListener alRegion = new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            regionAButton.setBorderPainted(regionAButton.isSelected());
            regionBButton.setBorderPainted(regionBButton.isSelected());
            regionCButton.setBorderPainted(regionCButton.isSelected());
            dlg.mark.paintSign();
        }
    };
    private ButtonGroup shapeButtons = new ButtonGroup();
    public JRadioButton pillarButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/PillarButton.png")));
    public JRadioButton sparButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/SparButton.png")));
    public JRadioButton coneButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/ConeButton.png")));
    public JRadioButton sphereButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/SphereButton.png")));
    public JRadioButton floatButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/FloatButton.png")));
    public JRadioButton beaconButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/BeaconButton.png")));
    public JRadioButton towerButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/TowerButton.png")));
    public JRadioButton perchButton = new JRadioButton(new ImageIcon(getClass().getResource("/images/PerchSButton.png")));
    public EnumMap<Shp, JRadioButton> shapes = new EnumMap<Shp, JRadioButton>(Shp.class);
    public EnumMap<Shp, Obj> objects = new EnumMap<Shp, Obj>(Shp.class);
    private ActionListener alShape = new ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            for (Shp shp : shapes.keySet()) {
                JRadioButton button = shapes.get(shp);
                if (button.isSelected()) {
                    dlg.mark.setShape(shp);
                    dlg.mark.setObject(objects.get(shp));
                    button.setBorderPainted(true);
                } else
                    button.setBorderPainted(false);
            }
            if (dlg.mark != null)
                dlg.mark.paintSign();
        }
    };

    public PanelStbd(OSeaMAction dia) {
        dlg = dia;
        this.setLayout(null);
        this.add(getRegionButton(regionAButton, 70, 0, 34, 30, "RegionA"), null);
        this.add(getRegionButton(regionBButton, 70, 32, 34, 30, "RegionB"), null);
        this.add(getRegionButton(regionCButton, 70, 64, 34, 30, "RegionC"), null);
        this.add(getShapeButton(pillarButton, 0, 0, 34, 32, "Pillar", Shp.PILLAR, Obj.BOYLAT), null);
        this.add(getShapeButton(sparButton, 0, 32, 34, 32, "Spar", Shp.SPAR, Obj.BOYLAT), null);
        this.add(getShapeButton(coneButton, 0, 64, 34, 32, "Cone", Shp.CONE, Obj.BOYLAT), null);
        this.add(getShapeButton(sphereButton, 0, 96, 34, 32, "Sphere", Shp.SPHERE, Obj.LITFLT), null);
        this.add(getShapeButton(floatButton, 0, 128, 34, 32, "Float", Shp.FLOAT, Obj.LITFLT), null);
        this.add(getShapeButton(beaconButton, 35, 0, 34, 32, "Beacon", Shp.BEACON, Obj.BCNLAT), null);
        this.add(getShapeButton(towerButton, 35, 32, 34, 32, "Tower", Shp.TOWER, Obj.BCNLAT), null);
        this.add(getShapeButton(perchButton, 35, 64, 34, 32, "Perch", Shp.PERCH, Obj.BCNLAT), null);
    }

    public void clearSelections() {
        shapeButtons.clearSelection();
        alShape.actionPerformed(null);
    }

    private JRadioButton getRegionButton(JRadioButton button, int x, int y, int w, int h, String tip) {
        button.setBounds(new Rectangle(x, y, w, h));
        button.setBorder(BorderFactory.createLineBorder(Color.magenta, 2));
        button.setToolTipText(Messages.getString(tip));
        button.addActionListener(alRegion);
        regionButtons.add(button);
        return button;
    }

    private JRadioButton getShapeButton(JRadioButton button, int x, int y, int w, int h, String tip, Shp shp, Obj obj) {
        button.setBounds(new Rectangle(x, y, w, h));
        button.setBorder(BorderFactory.createLineBorder(Color.magenta, 2));
        button.setToolTipText(Messages.getString(tip));
        button.addActionListener(alShape);
        shapeButtons.add(button);
        shapes.put(shp, button);
        objects.put(shp, obj);
        return button;
    }

}
