/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess;

import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author Dovile
 */
public class ImageFactory {
    public HashMap <String, ImageIcon> images;
    
    public ImageFactory(){
        images = new HashMap();
    }
    
    public ImageIcon getImage(String figure){
        ImageIcon image = (ImageIcon)images.get(figure);
        
        if(image == null){
            image = getIcon(figure);
            images.put(figure, image);
        }
        return image;
    }
    
    private ImageIcon getIcon(String figure){
        switch(figure){
            case("W2"):
                return new ImageIcon("WKING.png");
            case("W1"):
                return new ImageIcon("WQUEEN.png");
            case("W4"):
                return new ImageIcon("WROOK.png");
            case("W3"):
                return new ImageIcon("WKNIGHT.png");
            case("W5"):
                return new ImageIcon("WBISHOP.png");
            case("W6"):
                return new ImageIcon("WPAWN.png");
            case("B2"):
                return new ImageIcon("BKING.png");
            case("B1"):
                return new ImageIcon("BQUEEN.png");
            case("B4"):
                return new ImageIcon("BROOK.png");
            case("B3"):
                return new ImageIcon("BKNIGHT.png");
            case("B5"):
                return new ImageIcon("BBISHOP.png");
            case("B6"):
                return new ImageIcon("BPAWN.png");
        }
        return null;
    }
    
}
