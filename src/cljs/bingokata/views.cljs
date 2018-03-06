(ns bingokata.views
  (:require [re-frame.core :as re-frame]
            [bingokata.subs :as subs]))


(defn render-col [column]
  [:div.col
   (if (= 5 (count column))
     (for [k column] [:div.cell (str k)])
     (for [k (concat (take 2 column) "*" (take-last 2 column))] [:div.cell (str k)]))])

(defn main-panel []
  (let
    [name (re-frame/subscribe [::subs/name])
     card (re-frame/subscribe [::subs/actual-card])]

    [:div "bingokata from " @name
     [:button
      {:on-click #(re-frame/dispatch [:start-game])}
      "START"]

     [:br]
     (when @card
       [:div.card
        (for [c [:b :i :n :g :o]]
          (render-col (c @card)))
        ])]))
