package com.prog04.figuras;

public class Rectangulo
{
    private int base;
    private int altura;


    public Rectangulo()
    {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }


    public void setBase(int base)
    {
        this.base = base;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public int getBase()
    {
        return base;        
    }

    public int getAltura()
    {
        return altura;
    }

    public int getArea()
    {
        return base * altura;
    }

    public String toString()
    {
        return String.format("Base: %d\nAltura: %d\n",base,altura);
    }

    public boolean isCuadrado()
    {
        boolean cuadrado = false;
        if(base == altura)
        {
            cuadrado = true; 
        }
        return cuadrado;
        //return base == altura;
    }

}