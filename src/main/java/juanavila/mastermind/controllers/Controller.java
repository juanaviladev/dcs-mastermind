package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;

public abstract class Controller {
    
    protected Session session;

	Controller(Session session) {
		this.session = session;
  }

}
