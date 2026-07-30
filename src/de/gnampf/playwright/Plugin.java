package de.gnampf.playwright;

import de.willuhn.jameica.plugin.AbstractPlugin;

/**
 * Reines Bibliotheks-Plugin: liefert die Playwright- und stealth4j-Jars fuer andere
 * Plugins (via Jameicas gemeinsamen ClassLoader). Enthaelt selbst keine Logik.
 */
public class Plugin extends AbstractPlugin
{
	@Override
	public void init()
	{
	}
}
