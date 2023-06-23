/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hibernatedemo;

import com.mycompany.reponsitory.ProductReponsitory;
import java.util.HashMap;
import java.util.Map;





/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        
//        try(Session session = HibernateUtils.getFactory().openSession()){
//            Query q = session.createQuery("FROM Categorys");
//            List<Categorys> cates = q.getResultList();
//            cates.forEach(p -> System.out.println(p.getName()));
//            
//        }
        Map<String, String> params =  new HashMap<>();
        params.put("kw", "Galaxy");
        ProductReponsitory pre = new ProductReponsitory();
        pre.getProducts(null).forEach(p -> System.out.printf("%d - %s\n",p.getId(),p.getName()));
    }
}
