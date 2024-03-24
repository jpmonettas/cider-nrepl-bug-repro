(ns main
  (:import [javafx.embed.swing JFXPanel]
           [javafx.application Platform]
           [javafx.scene Scene]
           [javafx.stage Stage]
           [javafx.scene.control Label]))

(defn -main []
  (println "Starting...")
  (JFXPanel.)

  (Platform/runLater
   (fn []
     (let [scene (Scene. (Label. "Hello world") 1024 768)
           stage (doto (Stage.)
                   (.setScene scene))]

       (.show stage)))))


(comment
  (-main)


  )
