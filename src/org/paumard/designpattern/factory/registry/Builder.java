package org.paumard.designpattern.factory.registry;

import org.paumard.designpattern.factory.factory.Factory;

public interface Builder<T> {

	void register(String label, Factory<T> factory);
}
