(ns bingokata.views
  (:require [re-frame.core :as re-frame]
            [bingokata.subs :as subs]))


(defn main-panel []
  (let
    [name (re-frame/subscribe [::subs/name])
     card (re-frame/subscribe [::subs/actual-card])]

    [:div "bingokata from " @name
       [:button
        {:style {:background-color "white"}

         :on-click #(re-frame/dispatch [:start-game])}
        "START"]

       [:br]
       [:div (str @card)]]))
