package com.ben.finance.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Represents an income entry with an amount, source, and date.
 * Used to track money earned in the finance tracker.
 */
public class Income 
{
     // The amount of income. Must be zero or positive.
     private BigDecimal amount;

     // The source of the income (e.g., Job, Refund, Freelance).
     private String source;

     // The date the income was received.
     private LocalDate date;

     /**
      * Default constructor for testing or placeholder use.
      * Sets amount to 0, source to an empty string, and date to today.
      */
     public Income()
     {
          amount = BigDecimal.ZERO;
          source = "";
          date = LocalDate.now();
     }

     /**
      * Full constructor that creates an income object with specified values.
      * Validates amount and source to prevent bad data.
      *
      * @param newAmount The amount earned (must be >= 0)
      * @param newSource The income source (non-null, non-empty)
      * @param newDate   The date income was received
      */
     public Income(BigDecimal newAmount, String newSource, LocalDate newDate)
     {
          if (newAmount.compareTo(BigDecimal.ZERO) < 0)
          {
               throw new IllegalArgumentException("Amount cannot be negative.");
          }

          if (newSource == null || newSource.trim().isEmpty()) 
          {
               throw new IllegalArgumentException("Source cannot be empty.");
          }
           
          this.amount = newAmount;
          this.source = newSource;
          this.date = newDate;
     }

     // Getter for amount
     public BigDecimal getAmount()
     {
          return amount;
     }

     // Getter for source
     public String getSource()
     {
          return source;
     }

     // Getter for date
     public LocalDate getDate()
     {
          return date;
     }

     /**
      * Sets the amount of income. Must be zero or positive.
      */
     public void setAmount(BigDecimal newAmount)
     {
          if (newAmount.compareTo(BigDecimal.ZERO) < 0)
          {
               throw new IllegalArgumentException("Amount cannot be negative.");
          }

          this.amount = newAmount;
     }

     /**
      * Sets the income source. Cannot be null or empty.
      */
     public void setSource(String newSource)
     {
          if (newSource == null || newSource.trim().isEmpty()) 
          {
               throw new IllegalArgumentException("Source cannot be empty.");
          }

          this.source = newSource;
     }

     /**
      * Sets the income date.
      */
     public void setDate(LocalDate newDate)
     {
          this.date = newDate;
     }

     /**
      * Sets all income fields at once. Same validations apply.
      */
     public void setAll(BigDecimal newAmount, String newSource, LocalDate newDate)
     {
          if (newAmount.compareTo(BigDecimal.ZERO) < 0)
          {
               throw new IllegalArgumentException("Amount cannot be negative.");
          }

          if (newSource == null || newSource.trim().isEmpty()) 
          {
               throw new IllegalArgumentException("Source cannot be empty.");
          }

          this.amount = newAmount;
          this.source = newSource;
          this.date = newDate;
     }

     /**
      * Returns a string summary of the income object.
      */
     @Override
     public String toString()
     {
          return "Amount = " + amount + ", Source = " + source + ", Date = " + date + ".";
     }
}
