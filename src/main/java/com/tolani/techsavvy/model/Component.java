//package com.tolani.techsavvy.model;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "component")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class Component implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    private String ram;
//    private String rom;
//    private String keyboard;
//    private String screen;
//    private String motherboard;
//
//    @OneToOne
//    @JoinColumn(name = "order_id")
//    private Order order;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
//    private LocalDate createdAt;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss")
//    private LocalDate updatedAt;
//}
