package com.ead.ead_tt.entity;

import com.ead.ead_tt.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString
    @Table (name = "sales")
    public class Sale extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int siNo;
        private int salesmanId;
        @ManyToOne
        @JoinColumn(name = "proId", referencedColumnName = "prodId")
        private int prodId;
        private String salesmanName;
        private String dos;
        private int status;

}


