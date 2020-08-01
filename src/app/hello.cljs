(ns app.hello
  (:require [reagent.core :as r]))

(defn click-counter [click-count]
  [:div
   "O botão " [:code "contador"] " está com o valor: "
   @click-count ". "
   [:input {:type "button" :value "Click me!" :class "button"
            :on-click #(swap! click-count inc)}]])

(defn prompt [])


(def click-count (r/atom 0))

(defn hello []
  [:<>
   [:p "Oi, essa é minha primeira página com ClojureScript!"]
   [:p "Este é um exemplo de componente usando estado:"]
   [click-counter click-count]
   [:h1 "aqui tenho umformulário simples"]
    [:form
      [:p "Meu formulário"]
      [:input {:type "text" :placeholder "seu nome aqui"}]
      [:input {:type "submit" :value "Enviar" :class "button"}]
   ]])
