(ns bingokata.core
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]))

(defstyles screen
           [:body
            {:font-family "sans-serif"
             :font-size (px 16)
             :line-height 1.5}]
           [:.card
            {:display :flex
             :flex-direction :row
             :border "1px solid black"}]
           [:.col
            {:display :flex
             :flex-direction :column}]
           [:.cell
            {:text-align :center
             :border "1px solid black"
             :padding "1rem"}])
