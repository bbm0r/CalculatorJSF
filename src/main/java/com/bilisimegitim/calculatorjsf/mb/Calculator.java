
package com.bilisimegitim.calculatorjsf.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "calculator")
@RequestScoped
public class Calculator {
    private double s1;
        private double s2;
        private double sonuc;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getSonuc() {
        return sonuc;
    }

    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }
  public String topla()
  {
      sonuc = s1+s2;
      return "";
  }  
        
        public String cikar()
  {
      sonuc = s1-s2;
      return "";
  }  
        public String carp()
  {
      sonuc = s1*s2;
      return "";
  }  
        public String bol()
  {
      sonuc = s1/s2;
      return "";

  
  
  
  }  
        
        
        
    }
    

