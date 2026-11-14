/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccom.lab.lab9;
public class OrderService {
    private final VipDiscount vipDiscount;

    public OrderService(VipDiscount vipDiscount) {
        this.vipDiscount = vipDiscount;
    }

    public double calculateTotal(double subtotal) {
        return vipDiscount.apply(subtotal);
    }
}

