package juanavila.mastermind.controllers;

import juanavila.mastermind.models.Session;

public abstract class Controller {
    
    protected Session session;

	Controller(Session session) {
		this.session = session;
    }

    public void next() {
        this.session.next();
    }

    public void reset() {
        this.session.reset();
    }

}
