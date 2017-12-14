/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveResolving;

/**
 *
 * @author aiara
 */
public class MoveContext {
    private String figure;
    private String moveType;
    private String promotionTarget;
    private int possitionX;
    private int possitionY;
    private int possitionFromX;
    private int possitionFromY;

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public String getPromotionTarget() {
        return promotionTarget;
    }

    public void setPromotionTarget(String promotionTarget) {
        this.promotionTarget = promotionTarget;
    }

    public int getPossitionX() {
        return possitionX;
    }

    public void setPossitionX(int possitionX) {
        this.possitionX = possitionX;
    }

    public int getPossitionY() {
        return possitionY;
    }

    public void setPossitionY(int possitionY) {
        this.possitionY = possitionY;
    }

    public int getPossitionFromX() {
        return possitionFromX;
    }

    public void setPossitionFromX(int possitionFromX) {
        this.possitionFromX = possitionFromX;
    }

    public int getPossitionFromY() {
        return possitionFromY;
    }

    public void setPossitionFromY(int possitionFromY) {
        this.possitionFromY = possitionFromY;
    }
    
    
}
